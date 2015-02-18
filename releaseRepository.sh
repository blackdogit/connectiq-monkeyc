#! /bin/ksh

# Location of connectiq-monkeyc repository for the committed branch
export MC_DIR="$(pwd)"

# Location of connectiq-monkeyc repository for the gh-pages branch
export PAGES_DIR="${HOME}/pages"

# Check out the current pages
mkdir "${PAGES_DIR}"
git clone --depth=50 --branch=gh-pages --single-branch https://github.com/blackdogit/connectiq-monkeyc.git ${PAGES_DIR}
cd "${PAGES_DIR}"

# Configure the pages, so we can commit
git config credential.helper store --file="${PAGES_DIR}/.git/credentials"
echo "https://${GH_TOKEN}:@github.com" > "${PAGES_DIR}/.git/credentials"
git config --global user.email "build-user@blackdogit.com"
git config --global user.name "Travis Build"

REPOSITORY_BASEDIR="${PAGES_DIR}"
[[ "${TRAVIS_BRANCH}" != master ]] || REPOSITORY_BASEDIR="${REPOSITORY_BASEDIR}/beta"

# Replace the old repository
rm -rf "${REPOSITORY_BASEDIR}"/repository
cp -r "${MC_DIR}/com.blackdogit.connectiq.monkeyc.site/target/repository" "${REPOSITORY_BASEDIR}"

# Update the git index
git add --all .

# List the files
ls -Rl "${PAGES_DIR}"
git status 

# Commit the changes
git commit -m "updated for travis branch ${TRAVIS_BRANCH} build ${TRAVIS_BUILD_NUMBER}"

exit 0
