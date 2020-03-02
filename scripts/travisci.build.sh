#!/usr/bin/env bash
echo "author godcheese"
java -version
chmod +x ./mvnw
./mvnw --version
sudo ./mvnw -e clean install -DskipTests=true -Dmaven.javadoc.skip=true
sudo ./mvnw -e clean install -DskipTests=true -Dmaven.javadoc.skip=true