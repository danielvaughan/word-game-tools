FROM gradle:5.3-jdk8-alpine as compile

COPY . /java
WORKDIR /java
USER root
RUN chown -R gradle /java
USER gradle
RUN gradle :dictionary:clean build

FROM openjdk:8-jre-alpine

WORKDIR /app
COPY --from=compile "/java/dictionary/build/libs/dictionary-0.1.0.jar" /app/
ENTRYPOINT [ "java", "-jar", "/app/dictionary-0.1.0.jar"]
EXPOSE 8080
