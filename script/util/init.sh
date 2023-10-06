# get current directory
current_dir=$(realpath "$(dirname "${BASH_SOURCE[0]}")")
# setup global variables
. "${current_dir}/global_variables.sh"
cd "${ROOT_DIR}" || exit 1

# download EvoSuite
if [ ! -f "${ROOT_DIR}/evosuite-1.0.6.jar" ]; then
  wget https://github.com/EvoSuite/evosuite/releases/download/v1.0.6/evosuite-1.0.6.jar
  echo "Successfully installed EvoSuite."
else
  echo "EvoSuite is already installed."
fi
chmod +x "${ROOT_DIR}/evosuite-1.0.6.jar"
# download sdkman
bash "${UTIL_DIR}/install_sdkman.sh"
source "${UTIL_DIR}/init_sdkman.sh"
