FROM amazoncorretto:17

WORKDIR /app

COPY target/Prekol-0.0.1-SNAPSHOT.jar prekol.jar

EXPOSE 8081

ENTRYPOINT ["java", "-jar", "prekol.jar"]