FROM openjdk:8
EXPOSE 8080
ADD target/homehealthy.jar homehealthy.jar
ENTRYPOINT ["java", "-jar", "/homehealthy.jar"]
