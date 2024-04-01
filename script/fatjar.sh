#!/bin/bash
# This script tests the Defects4J export command for future reference.
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
  jar_path="${root_dir}/src/main/project-jars/${project_id}/${bug_id}/${project_id}_${bug_id}b.jar"
  if [ -f "${jar_path}" ]; then
    echo "Fat jar already generated for ${project_id}-${bug_id}b."
    continue
  fi
  if [ ! -d "$(dirname "${jar_path}")" ]; then
    mkdir -p "$(dirname "${jar_path}")"
  fi
  # checkout project
  sdk use java "8.0.382-amzn"
  project_dir="${root_dir}/temp/${project_id}_${bug_id}"
  defects4j checkout -p "${project_id}" -v "${bug_id}b" -w "${project_dir}"
  classpath=$(defects4j export -p "cp.compile" -w "${project_dir}")
  # initialize jar
  IFS=':' read -ra cp_elts <<< "${classpath}"
  num_elts=${#cp_elts[@]}
  if [ -d "${cp_elts[num_elts - 1]}" ]; then
    jar cf "${jar_path}" "${cp_elts[num_elts - 1]}"
  else
    cp "${cp_elts[num_elts - 1]}" "${jar_path}"
  fi
  # update jar with other classpath elements
  for ((i = num_elts - 2; i >= 0; i--)); do
    if [ -d "${cp_elts[i]}" ]; then
      jar uf "${jar_path}" "${cp_elts[i]}"
    else
      jar xf "${cp_elts[i]}" "${root_dir}/temp_jar"
      jar uf "${jar_path}" "${root_dir}/temp_jar"
      rm -r "${root_dir}/temp_jar"
    fi
  done
  # cleanup
  rm -r "${root_dir}/temp"
done < "${root_dir}/modified_classes.csv"
