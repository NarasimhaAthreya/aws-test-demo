FROM openjdk:8u302
WORKDIR /app
COPY ./target/*.jar /app
EXPOSE 8080
CMD ["java","-jar","AWSApplictionDemo-0.0.1-SNAPSHOT.jar"]
