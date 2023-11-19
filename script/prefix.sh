#!/bin/bash
current_dir=$(realpath "$(dirname "${BASH_SOURCE[0]}")")
root_dir=$(dirname "${current_dir}")
# setup defects4j and sdkman
export PATH=$PATH:"${DEFECTS4J_HOME}"/framework/bin
source "${current_dir}/util/init_sdkman.sh"

while IFS=, read -r project_id bug_id modified_class; do
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
  if [ -d "${root_dir}/src/main/evosuite-prefixes/${project_id}/${bug_id}" ]; then
    echo "Test prefixes already generated for ${project_id}-${bug_id}."
    continue
  fi
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
  # remove oracles
  sdk use java "17.0.8-oracle"
  mv "${root_dir}/output/${project_id}/evosuite/0" "${root_dir}/output/evosuite-tests"
  java -jar "${root_dir}/remover.jar" "remove_oracles" "${modified_class}"
  # cleanup output
  bash "${current_dir}/util/output.sh" "${project_id}" "${bug_id}"
  rm -r "${root_dir}/modified_class.txt"
  rm -r "${root_dir}/temp"
  rm -r "${root_dir}/evosuite-report"
  rm -r "${root_dir}/output"
  rm "${root_dir}/.tmp_file_needed_by_mock_of_FileHandler"*
done < "${root_dir}/modified_classes.csv"
