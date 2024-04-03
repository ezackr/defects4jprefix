ROOT_DIR=$(dirname "$(dirname ""$(realpath "$(dirname "${BASH_SOURCE[0]}")")"")")

# sdkman Java versions
JAVA8="8.0.392-amzn"
JAVA17="17.0.8-oracle"

# directories
DEFECTS4J_DIR="${ROOT_DIR}/defects4j"
SCRIPT_DIR="${ROOT_DIR}/script"
UTIL_DIR="${SCRIPT_DIR}/util"
RESOURCES_DIR="${SCRIPT_DIR}/resources"
SDKMAN_DIR="${RESOURCES_DIR}/sdkman"

# Sdkman Java versions
JAVA8="8.0.392-amzn"
JAVA11="11.0.21-amzn"
JAVA17="17.0.8-oracle"
# Sdkman Maven version
MAVEN_VERSION="3.9.4"
# Sdkman Ant version
ANT_VERSION="1.10.13"
# Sdkman Gradle version
GRADLE_VERSION="8.3"

# server
SERVER_PORT=5050

# defects4j path
#DEFECTS4J_HOME="path_to_defects4j"
