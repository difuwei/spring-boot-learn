package com.example.demospringboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;
import tk.mybatis.spring.annotation.MapperScan;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

@SpringBootApplication
// 开启定时任务
@EnableScheduling
@MapperScan(value = "com.example.dempspringboot.util.mapper")
public class DemoSpringBootApplication {
    public static void main(String[] args) {
//        Long time = System.currentTimeMillis();
        SpringApplication.run(DemoSpringBootApplication.class, args);
//        System.out.println("应用启动耗时："+(System.currentTimeMillis()-time));
//        System.out.println("abc");
//        List<String> strings = Arrays.asList("abc", "", "bc", "efg", "abcd","", "jkl");

    }

}
