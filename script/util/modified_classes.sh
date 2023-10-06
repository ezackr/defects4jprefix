current_dir=$(realpath "$(dirname "${BASH_SOURCE[0]}")")
root_dir="$(dirname "$(dirname "${current_dir}")")"
defects4j_dir="${root_dir}/defects4j"
# create new modified classes list
modified_classes="${root_dir}/modified_classes.csv"
if [ -f "${modified_classes}" ]; then
  rm "${modified_classes}"
fi

pids=$(defects4j pids)
# iterate through each project in Defects4J
while IFS= read -r pid; do
  bids=$(defects4j bids -p "${pid}")
  # iterate through each bug in the project
  while IFS= read -r bid; do
    bug_path="${defects4j_dir}/framework/projects/${pid}/modified_classes/${bid}.src"
    # iterate through each modified class in the bug
    while IFS= read -r modified_class; do
      echo "${pid},${bid},${modified_class}" >> "${modified_classes}"
    done < "${bug_path}"
  done <<< "${bids}"
done <<< "${pids}"

echo "modified_classes.sh: Saved modified classes to ${modified_classes}"
