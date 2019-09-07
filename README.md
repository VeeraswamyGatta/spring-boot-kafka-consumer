# Spring Boot with Kafka Consumer Example

This Project covers how to use Spring Boot with Spring Kafka to Consume JSON/String message from Kafka topics
## Start Zookeeper
- `bin/zookeeper-server-start.sh config/zookeeper.properties`

## Start Kafka Server
- `bin/kafka-server-start.sh config/server.properties`

## Create Kafka Topic
- `bin/windows/kafka-topics.sh --create --zookeeper zookeeper:2181 --replication-factor 1 --partitions 1 --topic Kafka_Example`
- `bin/windows/kafka-topics.cmd --create --zookeeper localhost:2181 --replication-factor 1 --partitions 1 --topic Kafka_Example_Json`

## List Kafka Topic
- `bin/windows/kafka-topics.sh --list --zookeeper zookeeper:2181`


## Publish to the Kafka Topic via Console
- `bin/kafka-console-producer.sh --broker-list localhost:9092 --topic Kafka_Example`
- `bin/kafka-console-producer.sh --broker-list localhost:9092 --topic Kafka_Example_Json`
