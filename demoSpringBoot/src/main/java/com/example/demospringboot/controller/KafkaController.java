package com.example.demospringboot.controller;

import com.alibaba.fastjson.JSON;
import com.example.demospringboot.util.kafka.DemoKafkaProducer;
import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.configurationprocessor.json.JSONObject;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

@RestController
@RequestMapping("kafka")
public class KafkaController {
    @Autowired
    private DemoKafkaProducer demoKafkaProducer;
    @Value("${spring.kafka.template.default-topic}")
    private String sendTopic;
    @RequestMapping("produceMsg")
    public String produceMsg(){
        Properties properties =new Properties();
        properties.put("acks","all");
        properties.put("bootstrap.servers", "localhost:9092");
        properties.put("group.id", "group-hello");
        properties.put("enable.auto.commit", "false");
        properties.put("auto.commit.interval.ms", "1000");
        properties.put("auto.offset.reset", "earliest");
        properties.put("session.timeout.ms", "30000");
        properties.put("key.deserializer", "org.apache.kafka.common.serialization.StringDeserializer");
        properties.put("key.serializer", "org.apache.kafka.common.serialization.StringSerializer");
        properties.put("value.deserializer", "org.apache.kafka.common.serialization.StringDeserializer");
        properties.put("value.serializer", "org.apache.kafka.common.serialization.StringSerializer");

        KafkaProducer<String, String> producer = new KafkaProducer(properties);
        //简单消息key-v
//        producer.send(new ProducerRecord(sendTopic,"key-"+sendTopic,"xiaoming1"));
        //发送复杂格式 list格式
//        JSONObject jsonObject = new JSONObject();
//        JSONObject jsonObject1 = new JSONObject();
//        try{
//            jsonObject.put("id","11111");
//            jsonObject1.put("id","222");
//            jsonObject.put("name","xiaoming-11");
//            jsonObject1.put("name","xiaoming-22");
//        }catch (Exception e){
//
//        }
//        List<String> stringList = new ArrayList<>();
//        stringList.add(jsonObject.toString());
//        stringList.add(jsonObject1.toString());
//        producer.send(new ProducerRecord(sendTopic,"key-"+sendTopic,stringList.toString()));

        //发送map
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("id","222");
        hashMap.put("name","xiaoming-222");
        HashMap<String, HashMap> hashMap1 = new HashMap<>();
        hashMap1.put("1",hashMap);
        producer.send(new ProducerRecord(sendTopic,"key-"+sendTopic, JSON.toJSONString(hashMap1)));
        return "topic:"+sendTopic+" create a msg";
    }

    //kafkaTemplate发送消息
//    http://localhost:9000/kafka/produceMsgTwo
    @RequestMapping("produceMsgTwo")
    public void produceMsgTwo(){
        demoKafkaProducer.sendProducerMsg();
    }
    @RequestMapping("consumeMsg")
    public void consumerMsg(){

    }
}
