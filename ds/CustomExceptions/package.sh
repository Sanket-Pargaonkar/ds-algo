#1 /bin/bash
NONE='\033[00m'
RED='\x1b[31m'
GREEN='\033[01;32m'
YELLOW='\033[01;33m'
PURPLE='\033[01;35m'
CYAN='\033[01;36m'
WHITE='\033[01;37m'
BOLD='\033[1m'
UNDERLINE='\033[4m'
BLINK='\x1b[5m'
ITALIC='\x1b[3m'
NORMAL='\x1b[2m'

while [ $# -gt 0 ]; do
    if [[ $1 == "--help" ]]; then
        usage
        exit 0
    elif [[ $1 == "--"* ]]; then
        v="${1/--/}"
        declare "$v"="$2"
        shift
    fi
    shift
done


function echo_err() {
    echo -e "${RED}${BLINK}$1"
}

function echo_ok() {
    echo -e "${GREEN}${BOLD}$1";
    echo -e "${WHITE}${ITALIC}${NORMAL}$2";
}

declare source="target/CustomExceptions-1.0.jar";
declare dest=$dest;
#"../arrays/libs/"

mvn compile  2>&- | grep "ERROR";
if [ $? -eq 0 ]; then
    echo_err "Phase:compile did not succeed"
    exit 1
fi
   
mvn -q package > /dev/null 2>&1;

if [ $? -eq 0 ]; then
    cp $source $dest
    echo_ok "SUCCESS!" "jar file packaged and copied successfully from ${source} to ${dest}";
else
    echo_err "Phase:package did not succeed"
    exit 1
fi


