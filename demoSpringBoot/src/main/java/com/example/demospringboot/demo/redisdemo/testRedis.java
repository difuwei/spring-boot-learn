package com.example.demospringboot.demo.redisdemo;

import com.example.demospringboot.util.mapper.RedisUtil;
import org.springframework.beans.factory.annotation.Autowired;

public class testRedis {
    @Autowired
    private RedisUtil redisUtil;

    public static void main(String[] args) {
//        redisUtil不能注入，是null，为什么？
//        new testRedis().redisUtil.set("name","dd");
    }
}
