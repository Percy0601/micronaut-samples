#!/bin/sh
docker build . -t micronaut-sample-native-image
echo
echo
echo "To run the docker container execute:"
echo "    $ docker run --network host micronaut-sample-native-image"
