FROM gradle:8.7-jdk21-alpine AS builder
WORKDIR /app

# Copy only build files first (better caching)
COPY build.gradle settings.gradle ./
COPY gradle ./gradle
COPY gradlew ./

# Download dependencies (cache layer)
RUN ./gradlew dependencies --no-daemon

# Copy source code
COPY src ./src

# Build Spring Boot jar
RUN ./gradlew clean bootJar -x test --no-daemon

# -----------------------------

FROM eclipse-temurin:21-jre-alpine AS runner
WORKDIR /app

COPY --from=builder /app/build/libs/gateway-service-0.0.1-SNAPSHOT.jar app.jar

EXPOSE 8096
ENTRYPOINT ["java", "-jar", "app.jar"]
