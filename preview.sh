#!/bin/bash

# if java version != 21

#prerequisites - install sdkman, java and quarkus
curl -s "https://get.sdkman.io" | bash
source "$HOME/.sdkman/bin/sdkman-init.sh"
sdk version
sdk install java 21.0.5-tem
sdk install quarkus 

curl -Ls https://sh.jbang.dev | bash -s - app setup
jbang app install --verbose --fresh --force roq@quarkiverse/quarkus-roq

# generate static website to target/roq
quarkus build

#serve the website hosted in target/roq/ at http://localhost:8x8x
roq