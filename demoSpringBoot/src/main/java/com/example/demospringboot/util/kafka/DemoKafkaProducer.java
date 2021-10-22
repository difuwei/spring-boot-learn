package com.example.demospringboot.util.kafka;

import lombok.extern.java.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;


@Component
public class DemoKafkaProducer {
    @Resource
    private KafkaTemplate<String,String> kafkaTemplate;
    @Value("${spring.kafka.template.default-topic}")
    private String topicUser;

    public void sendProducerMsg(){
        kafkaTemplate.send(topicUser,"name-kfktemplate","kafkaTemplate send msg");
        System.out.println("kafka发送消息了");
    }
}
