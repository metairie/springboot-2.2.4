FROM openjdk:latest

EXPOSE 8080/tcp
WORKDIR /opt/springboot-latest
COPY target/*.jar springboot.jar

ENTRYPOINT [ "java", "-jar", "springboot.jar" ]