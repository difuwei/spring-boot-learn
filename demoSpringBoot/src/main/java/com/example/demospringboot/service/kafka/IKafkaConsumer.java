package com.example.demospringboot.service.kafka;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.support.Acknowledgment;

public interface IKafkaConsumer {
    void listen(ConsumerRecord<?, ?> record, Acknowledgment acknowledgment);
}
