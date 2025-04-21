# Versões
ARG MAVEN_VERSION=3.8.8
ARG JAVA_VERSION=21

# Build
FROM maven:${MAVEN_VERSION}-amazoncorretto-${JAVA_VERSION} AS build
WORKDIR /app
COPY pom.xml .
COPY src ./src
RUN mvn clean package -DskipTests
RUN mvn --version # Verifica a versão do Maven

# Execução
FROM ghcr.io/graalvm/jdk-community:21
WORKDIR /app
COPY --from=build /app/target/*.jar app.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "app.jar"]
RUN java -version # Verifica a versão do Java
