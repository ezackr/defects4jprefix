#!/bin/bash
current_dir=$(realpath "$(dirname "${BASH_SOURCE[0]}")")
root_dir=$(dirname "${current_dir}")
. "${current_dir}/util/init_sdkman.sh"


