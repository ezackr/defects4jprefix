#!/bin/bash
current_dir=$(realpath "$(dirname "${BASH_SOURCE[0]}")")
root_dir=$(dirname "${current_dir}")
output_dir="${root_dir}/output"
source "${current_dir}/util/init_sdkman.sh"
sdk use java "8.0.382-amzn"

# Check arguments
if [ ! $# -eq 2 ]; then
  echo -e "evosuite.sh: Incorrect number of arguments. Expected 2 arguments, but got ${#}".
  exit 1
elif [ ! -d "${2}" ]; then
  echo -e "evosuite.sh: The system binaries path \"${2}\" does not exist."
  exit 1
fi

target_class="${1}"  # Fully-qualified name of target class
target_dir="${2}"  # Directory of binary files of the system under test
java -jar "${root_dir}/evosuite-1.0.6.jar" -class "${target_class}" -projectCP "${target_dir}" -seed 13042023
rm -r "${root_dir}/evosuite-report"

if [ -d "${output_dir}/evosuite-tests" ]; then
  rm - r "${output_dir}/evosuite-tests"
fi
mkdir -p "${output_dir}/evosuite-tests"
mv "${root_dir}/evosuite-tests" "${output_dir}"

sdk use java "17.0.8-oracle"
java -jar "${root_dir}/remover.jar" "remove_oracles" "${target_class}"
