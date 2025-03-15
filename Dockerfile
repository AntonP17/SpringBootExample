FROM openjdk:17-jdk-slim-buster
WORKDIR /app
COPY target/SpringBootExample-0.0.1-SNAPSHOT.jar /app/library.jar
ENTRYPOINT ["java", "-jar", "library.jar"]