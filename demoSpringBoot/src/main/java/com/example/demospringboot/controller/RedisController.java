package com.example.demospringboot.controller;

import com.example.demospringboot.util.mapper.RedisUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/redis")
public class RedisController {
    @Autowired
    private RedisUtil redisUtil;

//    reddisConfig 实现redis序列化
    @RequestMapping("/set")
//    http://localhost:8080/redis/set
    public void testKRedisSet(){
//        redis缓存key为name
        redisUtil.set("name","xiaoming1");

    }
}
