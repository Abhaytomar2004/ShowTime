# Stage 1: Build the application
FROM maven:3.8.7-eclipse-temurin-17 AS builder
WORKDIR /app

# Copy pom.xml and download dependencies first (for layer caching)
COPY pom.xml .
RUN mvn dependency:go-offline

# Copy source code and build
COPY src ./src
RUN mvn package -DskipTests

# Stage 2: Run the application
FROM eclipse-temurin:17-jre-jammy
WORKDIR /app

# Copy the built JAR from the builder stage
COPY --from=builder /app/target/*.jar app.jar

# Expose port (Spring Boot default is 8080)
EXPOSE 8081

# Entry point to run the application
ENTRYPOINT ["java", "-jar", "app.jar"] 