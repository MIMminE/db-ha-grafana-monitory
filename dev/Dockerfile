FROM openjdk:17-ea-17-jdk-slim

COPY ./target/dev-0.0.1-SNAPSHOT.jar /app/db_app.jar
#COPY ../prometheus/prometheus-2.49.1.linux-amd64 /app/prometheus

WORKDIR /app

CMD ["java", "-jar", "db_app.jar"]
