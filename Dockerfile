FROM openjdk:17-jdk-alpine
ARG ID=Test
ENV ID=$ID
COPY target/haproxy_sandbox-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["java", "-jar", "app.jar"]
