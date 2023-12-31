#!/bin/bash
# This script attempts to compile each test prefix generated by prefix.sh.
current_dir=$(realpath "$(dirname "${BASH_SOURCE[0]}")")
root_dir=$(dirname "${current_dir}")
# setup defects4j and sdkman
export PATH=$PATH:"${DEFECTS4J_HOME}"/framework/bin
source "${current_dir}/util/init_sdkman.sh"

# create bug detection output directory
if [ ! -d "${root_dir}/test-suite" ]; then
  mkdir "${root_dir}/test-suite"
fi
while IFS=, read -r project_id bug_id _; do
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
  sdk use java "8.0.382-amzn"
  # compress test suite
  cd "${root_dir}/src/main/evosuite-prefixes/${project_id}/${bug_id}" || exit 1
  tar -cvjSf "${project_id}-${bug_id}b-evosuite.tar.bz2" .
  mv "${project_id}-${bug_id}b-evosuite.tar.bz2" "${root_dir}/test-suite"
  cd - || exit 1
  # run bug detection
  run_bug_detection.pl -p "${project_id}" -d "${root_dir}/test-suite" -o "${root_dir}/test-suite"
  # cleanup
  rm "${root_dir}/test-suite/${project_id}-${bug_id}b-evosuite.tar.bz2"
done < "${root_dir}/modified_classes.csv"

# cleanup
rm -r "${root_dir}/test-suite"
