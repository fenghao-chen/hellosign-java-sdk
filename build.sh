#!/usr/bin/env bash

# see https://github.com/OpenAPITools/openapi-generator/tree/v5.4.0/modules/openapi-generator/src/main/resources/Java

set -e

WORKINGDIR="/app/java"

docker run --rm \
  -v "${PWD}/:/local" \
  openapitools/openapi-generator-cli:v5.3.0 generate \
    -i "/local/oas/openapi-sdk.yaml" \
    -c "/local/openapi-config.yaml" \
    -t "/local/templates" \
    -o "/local/"

printf "\nInstalling composer dependencies ...\n"
mkdir -p "${PWD}/vendor"
bash "${PWD}/bin/php" composer install
printf "\n"

printf "Adding examples to /examples ...\n"
rm -f "${PWD}/examples/"*.java
cp -r "${PWD}/oas/examples/"*.java "${PWD}/examples/"

printf "Adding examples to Docs ...\n"
bash "${PWD}/bin/php" ./bin/generate-examples.php

printf "Replacing strings ...\n"
docker run --rm \
  -v "${PWD}:${WORKINGDIR}" \
  -w "${WORKINGDIR}" \
  perl bash ./bin/replace

printf "Scanning for prohibited keywords ...\n"
docker run --rm \
  -v "${PWD}:${WORKINGDIR}" \
  -w "${WORKINGDIR}" \
  perl bash ./bin/scan_for

# Remove empty directory
rm -rf "${PWD}/api"

printf "Building ...\n"
bash "${PWD}/bin/maven" mvn clean install

printf "Success!\n"
