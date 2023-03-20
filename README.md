# Spring Cloud Stream with Kafka

> This is an example Spring Cloud Stream project with Kafka that shows how to send and receive messages from a Kafka topic.

The project consists of a Spring Boot application that uses Spring Cloud Stream to integrate with Kafka. The topic is defined in application.yml and the message is sent to it using the StreamBridge.

## Dependencies

The project depends on the following components:

- Spring Boot
- Spring Cloud Stream
- Apache Kafka

The dependencies are managed by Maven and can be found in pom.xml.

## Configuration

The project configuration is done in application.yml. The topic name and Kafka server address are defined in this configuration.

## How to use

To use this project, you should first start a Kafka server and create a topic.

Next, you can start the Spring Boot application with the following command:
```
./mvnw spring-boot:run
```
Once started, you can send messages to the topic using the following REST endpoint:

```
POST /mycontroller/send-message
```

## Author

This project was created by Gustavo Costa.