#!/bin/bash
# This script generates test prefixes for all bugs in Defects4J.
current_dir=$(realpath "$(dirname "${BASH_SOURCE[0]}")")
# Setup global variables
source "${current_dir}/util/global_variables.sh"
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
  if [ -f "${ROOT_DIR}/src/main/evosuite-prefixes/${project_id}/${bug_id}/${qualifiers}_ESTest.java" ]; then
    echo "Test prefixes already generated for ${project_id}-${bug_id}."
    continue
  fi
  if [ ! -f "${ROOT_DIR}/src/main/evosuite-tests/${project_id}/${bug_id}/${qualifiers}_ESTest.java" ]; then
    # generate new prefixes
    sdk use java "$JAVA8"
    echo "${modified_class}" > "${ROOT_DIR}/modified_class.txt"
    mkdir "${ROOT_DIR}/output"
    gen_tests.pl -g "evosuite" \
      -p "${project_id}" \
      -v "${bug_id}b" \
      -n 0 \
      -o "${ROOT_DIR}/output" \
      -b 300 \
      -c "${ROOT_DIR}/modified_class.txt" \
      -s 13042023 \
      -t "${ROOT_DIR}/temp"
    # decompress generated tests
    cd "${ROOT_DIR}/output/${project_id}/evosuite/0" || { echo -e "Unable to generate tests for ${project_id}-${bug_id}."; continue; }
    tar -xf "${project_id}-${bug_id}b-evosuite.0.tar.bz2"
    rm "${project_id}-${bug_id}b-evosuite.0.tar.bz2"
    cd - || exit 1
    # move tests to output directory
    mv "${ROOT_DIR}/output/${project_id}/evosuite/0" "${ROOT_DIR}/output/evosuite-tests"
  else
    # move tests from main to output directory
    echo "EvoSuite tests already generated for ${project_id}-${bug_id}."
    mkdir -p "${ROOT_DIR}/output/evosuite-tests/$(dirname "${qualifiers}")"
    mv "${ROOT_DIR}/src/main/evosuite-tests/${project_id}/${bug_id}/${qualifiers}_ESTest.java" "${ROOT_DIR}/output/evosuite-tests/${qualifiers}_ESTest.java"
    mv "${ROOT_DIR}/src/main/evosuite-tests/${project_id}/${bug_id}/${qualifiers}_ESTest_scaffolding.java" "${ROOT_DIR}/output/evosuite-tests/${qualifiers}_ESTest_scaffolding.java"
  fi
  # remove oracles
  sdk use java "$JAVA17"
  java -jar "${ROOT_DIR}/remover.jar" "remove_oracles" "${ROOT_DIR}/output/evosuite-tests"
  # move and cleanup output
  bash "${current_dir}/util/output.sh" "${project_id}" "${bug_id}" "${modified_class}"
done < "${ROOT_DIR}/modified_classes.csv"
