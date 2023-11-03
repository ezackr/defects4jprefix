#!/bin/bash
current_dir=$(realpath "$(dirname "${BASH_SOURCE[0]}")")
root_dir=$(dirname "${current_dir}")
source "${current_dir}/util/init_sdkman.sh"
sdk use java "8.0.382-amzn"

while IFS=, read -r project_id bug_id modified_class; do
  if [ ${#} -gt 0 ]; then
    if [ "${project_id}" != "${1}" ]; then
      continue
    fi
    if [ "${bug_id}" != "${2}" ]; then
      continue
    fi
  fi
  echo "${modified_class}" > "${root_dir}/modified_class.txt"
  mkdir "${root_dir}/output"
  gen_tests.pl -g "evosuite" \
    -p "${project_id}" \
    -v "${bug_id}b" \
    -n 10 \
    -o "${root_dir}/output" \
    -b 300 \
    -c "${root_dir}/modified_class.txt" \
    -s 13042023 \
    -t "${root_dir}/temp"
#  bash "${current_dir}/util/output.sh" "${project_id}" "${bug_id}"
  rm -r "${root_dir}/modified_class.txt"
  rm -r "${root_dir}/temp"
  rm -r "${root_dir}/evosuite-report"
#  rm -r "${root_dir}/output"
done < "${root_dir}/modified_classes.csv"
