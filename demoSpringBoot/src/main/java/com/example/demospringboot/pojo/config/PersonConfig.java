package com.example.demospringboot.pojo.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Data
//只有这个组件是容器中的组件，才能使用容器提供的@ConfigurationProperties功能
@Component
@ConfigurationProperties(prefix = "data.person")
//获取data.person中配置
public class PersonConfig {
    private String name;
    private String age;
    private String sex;
    private String url;
}
