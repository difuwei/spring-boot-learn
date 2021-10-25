package com.example.demospringboot.service.kafka;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.example.demospringboot.pojo.KafkaConsumer;
import lombok.extern.slf4j.Slf4j;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.support.Acknowledgment;
import org.springframework.stereotype.Component;

import java.util.*;

@Component
@Slf4j
//监听消费
public class KafkaConsumerImpl{

    @KafkaListener(
            groupId = "group-hello",
            topics = {"${spring.kafka.template.default-topic}"},
            concurrency = "${kafka.listen.concurrency:1}",
            autoStartup = "${kafka.listen.auto.start:true}")
    public void listen(ConsumerRecord<?, ?> record,Acknowledgment acknowledgment) {
        System.out.println("topic:"+record.topic());
        System.out.println("key:"+record.key());
        Optional<?> kafkaMessage = Optional.ofNullable(record.value());
        if (kafkaMessage.isPresent()) {
            String message = kafkaMessage.get().toString();
            System.out.println("receive-msg:"+message);
            //解析list格式
//            String message = kafkaMessage.get().toString();
//            List<KafkaConsumer> kafkaConsumerList = JSON.parseArray(message,KafkaConsumer.class);
//            System.out.println("receive-msg-list:"+kafkaConsumerList);
            log.info("receive ------------------ message =" + message);
            //解析map格式
            try {
                JSONObject kafkaConsumerMap = JSONObject.parseObject(message);
                System.out.println("receive-msg-json:" + kafkaConsumerMap);
                KafkaConsumer kafkaConsumer = JSON.parseObject(JSON.toJSONString(kafkaConsumerMap.get("1")), KafkaConsumer.class);
                System.out.println("kafkaConsumer-id:" + kafkaConsumer.getId());
                System.out.println("kafkaConsumer-address:" + kafkaConsumer.getAddress());
            }catch (Exception e){
                //消息非json字符串格式
            }
//            MessageModel messageModel = null;
//            try {
//                messageModel = gson.fromJson(message.toString(), MessageModel.class);
//                processHandler(messageModel);
//            } catch (Exception e) {
                acknowledgment.acknowledge();
//                log.error("消息处理失败，transId：{}。error message:{}", messageModel == null ? null : messageModel.getTransId(), e);
//            } finally {
//                log.info("消息处理结束，偏移量已提交，transId：{}", messageModel == null ? null : messageModel.getTransId());
//            }
        }
    }
}
