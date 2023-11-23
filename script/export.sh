#!/bin/bash
current_dir=$(realpath "$(dirname "${BASH_SOURCE[0]}")")
root_dir=$(dirname "${current_dir}")
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
  sdk use java "8.0.382-amzn"
  # checkout project
  project_dir="${root_dir}/temp/${project_id}_${bug_id}"
  defects4j checkout -p "${project_id}" -v "${bug_id}b" -w "${project_dir}"
  # cd into project and export information
  cd "${project_dir}" || exit 1
  defects4j export -p "dir.src.classes" -o "${root_dir}/src.txt"
  cd - || exit 1
  # cleanup
  rm -r "${root_dir}/temp"
done < "${root_dir}/modified_classes.csv"
