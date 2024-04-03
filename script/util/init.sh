# get current directory
current_dir=$(realpath "$(dirname "${BASH_SOURCE[0]}")")
# Setup global variables
source "${current_dir}/global_variables.sh"
cd "${ROOT_DIR}" || exit 1
# download sdkman
bash "${UTIL_DIR}/install_sdkman.sh"
source "${UTIL_DIR}/init_sdkman.sh"
