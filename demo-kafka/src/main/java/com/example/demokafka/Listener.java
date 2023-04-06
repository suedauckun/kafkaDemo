package com.example.demokafka;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class Listener {
    @KafkaListener(topics="testTopic",groupId="group1")
    public void listenMessage(String message) {

        System.out.println(message);
    }
}
