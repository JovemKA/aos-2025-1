# Fase de build
FROM maven:3.8.8-amazoncorretto-21 AS build
WORKDIR /app
COPY pom.xml .
COPY src ./src
RUN mvn clean install -DskipTests
RUN mvn --version # Verifica a versão do Maven

# Fase de execução
FROM ghcr.io/graalvm/jdk-community:21
WORKDIR /app
COPY --from=build /app/target/pessoa-api-0.0.1.jar app.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "app.jar"]
RUN java -version # Verifica a versão do Java
