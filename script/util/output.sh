# get current directory
current_dir=$(realpath "$(dirname "${BASH_SOURCE[0]}")")
# setup global variables
. "${current_dir}/global_variables.sh"
cd "${ROOT_DIR}" || exit 1

project_id="${1}"
bug_id="${2}"
modified_class="${3}"
qualifiers=$(echo "${modified_class}" | sed 's/\./\//g' | xargs dirname)
if [ ! -d "${ROOT_DIR}/output" ]; then
  echo -e "output.sh: Unable to find output directory."
  exit 1
fi

src_dir="${ROOT_DIR}/src/main"
# move tests
test_dir="${src_dir}/evosuite-tests/${project_id}/${bug_id}/${qualifiers}"
if [ ! -d "${test_dir}" ]; then
  mkdir -p "${test_dir}"
fi
mv "${ROOT_DIR}/output/evosuite-tests/${qualifiers}/"* "${test_dir}/"
# move simple tests
simple_test_dir="${src_dir}/evosuite-simple-tests/${project_id}/${bug_id}/${qualifiers}"
if [ ! -d "${simple_test_dir}" ]; then
  mkdir -p "${simple_test_dir}"
fi
mv "${ROOT_DIR}/output/evosuite-simple-tests/${qualifiers}/"* "${simple_test_dir}/"
# move prefixes
prefix_dir="${src_dir}/evosuite-prefixes/${project_id}/${bug_id}/${qualifiers}"
if [ ! -d "${prefix_dir}" ]; then
  mkdir -p "${prefix_dir}"
fi
mv "${ROOT_DIR}/output/evosuite-prefixes/${qualifiers}/"* "${prefix_dir}/"

# cleanup directories
rm -r "${ROOT_DIR}/modified_class.txt"
rm -r "${ROOT_DIR}/temp"
rm -r "${ROOT_DIR}/evosuite-report"
rm -r "${ROOT_DIR}/output"
rm "${ROOT_DIR}/.tmp_file_needed_by_mock_of_FileHandler"*
