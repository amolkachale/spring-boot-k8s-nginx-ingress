FROM openjdk:8-jdk-alpine

LABEL maintainer="amol kachale"

VOLUME /tmp

EXPOSE 8081

ADD target/*.jar spring-boot-k8s-app1.jar

ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","spring-boot-k8s-app1.jar"]