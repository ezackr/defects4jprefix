cd "${ROOT_DIR}" || exit 1

if [ ! -d "" ]; then
  git clone https://github.com/rjust/defects4j
  echo "Successfully cloned Defects4J repository."
else
  echo "Defects4J repository is already cloned."
fi

cd "${DEFECTS4J_DIR}" || exit 1
cpan --installdeps .
./init.sh

export PATH=$PATH:"${DEFECTS4J_DIR}"/framework/bin
