package com.example.demospringboot.util.kafka;

import com.example.demospringboot.handler.HandlerKafkaSendResult;
import lombok.extern.java.Log;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.SendResult;
import org.springframework.stereotype.Component;
import org.springframework.util.concurrent.FailureCallback;
import org.springframework.util.concurrent.ListenableFuture;
import org.springframework.util.concurrent.SuccessCallback;

import javax.annotation.Resource;


@Component
@Slf4j
public class DemoKafkaProducer {
    @Resource
    private KafkaTemplate<String,String> kafkaTemplate;
    @Value("${spring.kafka.template.default-topic}")
    private String topicUser;

    ListenableFuture listenableFuture = null;

    @Autowired
    HandlerKafkaSendResult handlerKafkaSendResult;

    public void sendProducerMsg(){
        //发送回调类，
        kafkaTemplate.setProducerListener(handlerKafkaSendResult);
        kafkaTemplate.send(topicUser,"name-kfktemplate","kafkaTemplate send msg");
        //回调消息处理也可以用下面的代替
//        listenableFuture = kafkaTemplate.send(topicUser,"name-kfktemplate","kafkaTemplate send msg");
//        SuccessCallback<SendResult> successCallback = new SuccessCallback<SendResult>() {
//            @Override
//            public void onSuccess(SendResult sendResult) {
//                //发送成功通知
//                log.info("111111");
//            }
//        };
//        FailureCallback failureCallback = new FailureCallback() {
//            @Override
//            public void onFailure(Throwable throwable) {
//                System.out.println("222");
//            }
//        };
//        try{
//            listenableFuture.addCallback(successCallback, failureCallback);
//        }catch (Exception e){
//
//        }
    }
}
