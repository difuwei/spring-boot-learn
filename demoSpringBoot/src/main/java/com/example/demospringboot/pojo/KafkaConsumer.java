package com.example.demospringboot.pojo;

import lombok.Data;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Data
public class KafkaConsumer {
    private Integer id;
    private String name;
}
