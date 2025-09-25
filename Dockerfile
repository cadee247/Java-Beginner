FROM gradle:8.4.0-jdk17 AS build
WORKDIR /app
COPY . .
RUN gradle build

FROM eclipse-temurin:17-jdk
WORKDIR /app
COPY --from=build /app/build/libs/*.jar app.jar
CMD ["java", "-jar", "app.jar"]
