package com.code.kafka.springbootkafkaconsumerexample.listener;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumer {

   


    @KafkaListener(topics = "Kafka_Example", group = "group_id",
            containerFactory = "kafkaListenerContainerFactory")
    public void consumeString(String message) {
        System.out.println("Consumed Message  : " + message);
    }
    
    /* @KafkaListener(topics = "Kafka_Example_Json", group = "group_json",
	    containerFactory = "userKafkaListenerFactory")
		public void consumeJson(User user) {
		System.out.println("Consumed JSON Message: " + user);
	}

	 @KafkaListener(topics = "__consumer-offsets", group = "test-consumer-group")
	    public void consume(String message) {
	        System.out.println("Consumed message: " + message);
	    }*/
}
