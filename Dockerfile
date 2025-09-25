# 🏗️ Stage 1: Build the Java app using Gradle wrapper
FROM gradle:8.4.0-jdk17 AS build
WORKDIR /app

# Copy everything into the container
COPY . .

# 🔓 Make the Gradle wrapper executable
RUN chmod +x gradlew

# 🛠️ Use the Gradle wrapper to build the project
RUN ./gradlew build

# 🚀 Stage 2: Run the built JAR using a lightweight JDK image
FROM eclipse-temurin:17-jdk
WORKDIR /app

# Copy the built JAR from the previous stage
COPY --from=build /app/build/libs/*.jar app.jar

# 🧠 Run the app
CMD ["java", "-jar", "app.jar"]
