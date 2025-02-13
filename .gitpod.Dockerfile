FROM gitpod/workspace-full:latest

RUN  curl -s "https://get.sdkman.io" | bash \
     && source "$HOME/.sdkman/bin/sdkman-init.sh"
RUN echo "sdkman_auto_answer=true" > ~/.sdkman/etc/config
RUN sdk install java 21.0.5-tem \
    && sdk install quarkus \
    && sdk install jbang
RUN jbang trust add https://github.com/quarkiverse/quarkus-roq/blob/HEAD/roq.java
RUN jbang app install --fresh --force roq@quarkiverse/quarkus-roq