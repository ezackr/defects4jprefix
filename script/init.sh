# get current directory
current_dir=$(realpath "$(dirname "${BASH_SOURCE[0]}")")
# setup global variables
. "${current_dir}/util/global_variables.sh"
cd "${ROOT_DIR}" || exit 1

# download EvoSuite
if [ ! -f "${ROOT_DIR}/evosuite-1.0.6.jar" ]; then
  wget https://github.com/EvoSuite/evosuite/releases/download/v1.0.6/evosuite-1.0.6.jar
  echo "Successfully installed EvoSuite."
else
  echo "EvoSuite is already installed."
fi
# download Defects4J
source "${UTIL_DIR}/install_defects4j.sh"
# download sdkman
bash "${UTIL_DIR}/install_sdkman.sh"
source "${UTIL_DIR}/init_sdkman.sh"

# install Java 8
sdk install java 8.0.382-amzn
# install Java 17
sdk install java 17.0.8-oracle
# install maven
sdk install maven 3.9.4
# install ant
sdk install ant 1.10.13
# install gradle
sdk install gradle 8.3