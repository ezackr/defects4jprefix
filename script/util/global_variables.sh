current_dir=$(realpath "$(dirname "${BASH_SOURCE[0]}")")
ROOT_DIR=$(dirname "$(dirname "${current_dir}")")

# sdkman Java versions
JAVA8="8.0.382-amzn"
JAVA17="17.0.8-oracle"

# directories
RESOURCES_DIR="${ROOT_DIR}/script/resources"
UTIL_DIR="${ROOT_DIR}/script/util"
DEFECTS4J_DIR="${ROOT_DIR}/defects4j"
SDKMAN_DIR="${RESOURCES_DIR}/sdkman"

# server
SERVER_PORT=5050

# export variables
export ROOT_DIR
export JAVA8
export JAVA17
export UTIL_DIR
export DEFECTS4J_DIR
export SDKMAN_DIR
export SERVER_PORT
