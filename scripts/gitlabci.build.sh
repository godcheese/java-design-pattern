#!/usr/bin/env bash
java -version
chmod +x ./mvnw
./mvnw -e clean install -DskipTests=true -Dmaven.javadoc.skip=true
./mvnw -e clean install -DskipTests=true -Dmaven.javadoc.skip=true