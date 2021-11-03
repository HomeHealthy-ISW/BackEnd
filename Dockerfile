FROM openjdk:8
EXPOSE 8080
ADD target/homehealthy-1.0.jar homehealthy-1.0.jar
ENTRYPOINT ["java", "-jar", "/homehealthy-1.0.jar"]
