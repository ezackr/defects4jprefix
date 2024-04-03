#!/bin/bash
# This script tests the Defects4J export command for future reference.
current_dir=$(realpath "$(dirname "${BASH_SOURCE[0]}")")
ROOT_DIR=$(dirname "${current_dir}")
# Setup global variables
source "${current_dir}/util/global_variables.sh"
# setup defects4j and sdkman
export PATH=$PATH:"${DEFECTS4J_HOME}"/framework/bin
source "${current_dir}/util/init_sdkman.sh"

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
  sdk use java "$JAVA8"
  # checkout project
  project_dir="${ROOT_DIR}/temp/${project_id}_${bug_id}"
  defects4j checkout -p "${project_id}" -v "${bug_id}b" -w "${project_dir}"
  # cd into project and export information
  cd "${project_dir}" || exit 1
  src_dir=$(defects4j export -p "cp.compile")
  echo "Found classpath: ${src_dir}"
  cd - || exit 1
  # cleanup
  rm -r "${ROOT_DIR}/temp"
done < "${ROOT_DIR}/modified_classes.csv"
