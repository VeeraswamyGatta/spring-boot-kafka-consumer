FROM openjdk:8
ADD target/spring-boot-kafka-consumer-example.jar spring-boot-kafka-consumer-example.jar
EXPOSE 8084
ENTRYPOINT ["java", "-jar", "spring-boot-kafka-consumer-example.jar"]