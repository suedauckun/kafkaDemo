package com.example.demokafka;

import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DemoKafkaApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoKafkaApplication.class, args);
    }

    @Bean
    public ApplicationRunner runner(Publisher publisher) {
        return args -> {
            publisher.sendMessage("Hello");
        };
    }
}
