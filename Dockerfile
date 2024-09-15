FROM maven:3.9.9-eclipse-temurin-22 as build
WORKDIR /app
COPY pom.xml ./
COPY src ./src
RUN mvn clean install -DskipTests
CMD ["mvn", "spring-boot:run"]