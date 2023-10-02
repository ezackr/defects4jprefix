# Get current directory
current_dir=$(realpath "$(dirname "${BASH_SOURCE[0]}")")
# Setup global variables
. "${current_dir}/util/global_variables.sh"
cd "${ROOT_DIR}" || exit 1

# Download sdkman
bash "${UTIL_DIR}/install_sdkman.sh"
source "${UTIL_DIR}/init_sdkman.sh"

# Install Java 8
sdk install java 8.0.382-amzn
# Install Java 17
sdk install java 17.0.8-oracle
# Install maven
sdk install maven 3.9.4
# Install ant
sdk install ant 1.10.13
# Install gradle
sdk install gradle 8.3