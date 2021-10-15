package com.example.demospringboot.demo.BaseType.testConfig;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
//#要注意的地方是 属性名 要与 XXX.properties中的参数的名保持一致，详见属性注解

//标识这是一个配置类
@Configuration
@ConfigurationProperties(prefix = "data")  // 读取前缀为 data 的内容
//如果只有一个主配置类文件，@PropertySource可以不写
@PropertySource("classpath:application.properties")
// @PropertySource(value = { "classpath:config/XXX.properties" }, encoding = "utf-8")
public class MapConfig{

    /**
     * data.person.name
     * 这里map名需要和XXX.properties中的参数data.person.name的person一	 致
     */
    private Map<String, String> person = new HashMap<>();
    /**
     * data.list
     * 这里list名需要和XXX.properties中的参数data.list的list一致
     */
    private List<String> list = new ArrayList<>();


    /**
     * 编写get，set方法方便使用
     */
    public Map<String, String> getPerson() {
        return person;
    }

    public void setPerson(Map<String, String> person) {
        this.person = person;
    }

    public List<String> getList() {
        return list;
    }

    public void setList(List<String> list) {
        this.list = list;
    }
}