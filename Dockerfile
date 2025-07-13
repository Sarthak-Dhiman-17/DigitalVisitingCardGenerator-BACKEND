FROM ubuntu:latest
LABEL authors="SarthakDhiman"

ENTRYPOINT ["top", "-b"]

# ------------ Build Stage ------------
FROM eclipse-temurin:17-jdk-alpine as builder
WORKDIR /app
COPY . .
RUN ./mvnw package -DskipTests

# ------------ Run Stage ------------
FROM eclipse-temurin:17-jdk-alpine
WORKDIR /app
COPY --from=builder /app/target/*.jar app.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "app.jar"]
