package com.example.demospringboot.demo.BaseType.testConfig;

import com.example.demospringboot.pojo.Resource;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.configurationprocessor.json.JSONArray;
import org.springframework.boot.configurationprocessor.json.JSONObject;

import java.util.Map;
public class testGetConifg {
    @Autowired
    private Resource resource;

    @Test
    public void contextLoads() {
        System.out.println(resource.getName());
//        Map<String, String> person = dataConfig.getPerson();
//        person.forEach((k,v)-> System.out.println(k+"----"+v));
    }

}
