#!/bin/bash
current_dir=$(realpath "$(dirname "${BASH_SOURCE[0]}")")
root_dir=$(dirname "${current_dir}")
# setup defects4j and sdkman
export PATH=$PATH:"${DEFECTS4J_HOME}"/framework/bin
source "${current_dir}/util/init_sdkman.sh"

# helper function that converts a class path to a fat jar
class_path_to_fat_jar() {
  # iterate through paths in class path (in reverse order to avoid overriding classes)
  IFS=":" read -ra paths <<< "${1}"
  num_paths=${#paths[@]}
  # initialize jar

  # add remaining paths to jar
  for ((i = num_paths - 1; i >= 0; i--)); do
    path="${paths[${i}]}"
    echo "${path}"
  done
}

# generate fat jar for all bugs in Defects4J
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
  # cd into project and get fat jar
  cd "${project_dir}" || exit 1
  class_path=$(defects4j export -p "cp.compile")
  class_path_to_fat_jar "${class_path}"
  cd - || exit 1
  # cleanup
  rm -r "${root_dir}/temp"
done < "${root_dir}/modified_classes.csv"
