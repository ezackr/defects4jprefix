#!/bin/bash
current_dir=$(realpath "$(dirname "${BASH_SOURCE[0]}")")
root_dir=$(dirname "${current_dir}")
. "${current_dir}/util/init_sdkman.sh"
sdk use java "8.0.382-amzn"

while IFS=, read -r project_id bug_id modified_class; do
  project_dir="${root_dir}/temp/${project_id}_${bug_id}b"
  defects4j checkout -p "${project_id}" -v "${bug_id}b" -w "${project_dir}"
  defects4j compile -w "${project_dir}"
  # get binary path (dependent on build system)
  if [ -d "${project_dir}/build/classes" ]; then
    binary_path="build/classes"  # gradle
  elif [ -d "${project_dir}/build" ]; then
    binary_path="build"  # ant
  elif [ -d "${project_dir}/target/classes" ]; then
    binary_path="target/classes"  # maven
  else
    echo -e "Unable to find system binaries for project ${project_id}."
    exit 1
  fi
  bash "${current_dir}/evosuite.sh" "${modified_class}" "${project_dir}/${binary_path}"
done < "${root_dir}/modified_classes.csv"
