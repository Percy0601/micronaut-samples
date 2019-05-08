FROM oracle/graalvm-ce:1.0.0-rc15 as graalvm
COPY . /home/app/micronaut-sample-native-image
WORKDIR /home/app/micronaut-sample-native-image
RUN native-image --no-server -cp target/micronaut-sample-native-image-*.jar

FROM frolvlad/alpine-glibc
EXPOSE 8080
COPY --from=graalvm /home/app/micronaut-sample-native-image .
ENTRYPOINT ["./micronaut-sample-native-image"]
