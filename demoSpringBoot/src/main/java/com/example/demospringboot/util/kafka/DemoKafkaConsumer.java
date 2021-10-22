package com.example.demospringboot.util.kafka;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class DemoKafkaConsumer {

    @Value("spring.kafka.template.default-topic")
    private String topicUser;

    public void consume(){

    }
}
