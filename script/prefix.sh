#!/bin/bash
# This script generates test prefixes for all bugs in Defects4J.
current_dir=$(realpath "$(dirname "${BASH_SOURCE[0]}")")
root_dir=$(dirname "${current_dir}")
# setup defects4j and sdkman
export PATH=$PATH:"${DEFECTS4J_HOME}"/framework/bin
source "${current_dir}/util/init_sdkman.sh"

while IFS=, read -r project_id bug_id modified_class; do
  # check for a given project or bug id
  if [ ${#} -gt 0 ]; then
    if [ "${project_id}" != "${1}" ]; then
      continue
    fi
    if [ ${#} -gt 1 ]; then
      if [ "${bug_id}" != "${2}" ]; then
        continue
      fi
    fi
  fi
  # check if prefixes are already generated
  qualifiers=$(echo "${modified_class}" | sed 's/\./\//g')
  if [ -f "${root_dir}/src/main/evosuite-prefixes/${project_id}/${bug_id}/${qualifiers}_ESTest.java" ]; then
    echo "Test prefixes already generated for ${project_id}-${bug_id}."
    continue
  fi
  if [ ! -f "${root_dir}/src/main/evosuite-tests/${project_id}/${bug_id}/${qualifiers}_ESTest.java" ]; then
    # generate new prefixes
    sdk use java "8.0.382-amzn"
    echo "${modified_class}" > "${root_dir}/modified_class.txt"
    mkdir "${root_dir}/output"
    gen_tests.pl -g "evosuite" \
      -p "${project_id}" \
      -v "${bug_id}b" \
      -n 0 \
      -o "${root_dir}/output" \
      -b 300 \
      -c "${root_dir}/modified_class.txt" \
      -s 13042023 \
      -t "${root_dir}/temp"
    # decompress generated tests
    cd "${root_dir}/output/${project_id}/evosuite/0" || { echo -e "Unable to generate tests for ${project_id}-${bug_id}."; continue; }
    tar -xf "${project_id}-${bug_id}b-evosuite.0.tar.bz2"
    rm "${project_id}-${bug_id}b-evosuite.0.tar.bz2"
    cd - || exit 1
    # move tests to output directory
    mv "${root_dir}/output/${project_id}/evosuite/0" "${root_dir}/output/evosuite-tests"
  else
    # move tests from main to output directory
    echo "EvoSuite tests already generated for ${project_id}-${bug_id}."
    mkdir -p "${root_dir}/output/evosuite-tests/$(dirname "${qualifiers}")"
    mv "${root_dir}/src/main/evosuite-tests/${project_id}/${bug_id}/${qualifiers}_ESTest.java" "${root_dir}/output/evosuite-tests/${qualifiers}_ESTest.java"
    mv "${root_dir}/src/main/evosuite-tests/${project_id}/${bug_id}/${qualifiers}_ESTest_scaffolding.java" "${root_dir}/output/evosuite-tests/${qualifiers}_ESTest_scaffolding.java"
  fi
  # remove oracles
  sdk use java "17.0.8-oracle"
  java -jar "${root_dir}/remover.jar" "remove_oracles" "${root_dir}/output/evosuite-tests"
  # move and cleanup output
  bash "${root_dir}/script/util/output.sh" "${project_id}" "${bug_id}" "${modified_class}"
done < "${root_dir}/modified_classes.csv"
