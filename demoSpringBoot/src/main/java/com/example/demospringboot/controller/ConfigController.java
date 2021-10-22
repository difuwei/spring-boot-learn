package com.example.demospringboot.controller;

import com.example.demospringboot.config.TestGetConfig;
import com.example.demospringboot.pojo.config.PersonConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/config")
public class ConfigController {
    @Autowired
    TestGetConfig testGetConfig;
    @Autowired
    Environment environment;
    @Autowired
    PersonConfig personConfig;
    @RequestMapping("name")
    public String getName(){
        return testGetConfig.getName();
    }
    @RequestMapping("profiles")
    public Object getProfiles(){
        return testGetConfig.getProfiles();
    }
//    config/personConfig
    @RequestMapping("personConfig")
    public Object getData(){
        System.out.println(personConfig.getSex());
        System.out.println(personConfig.getAge());
        System.out.println(personConfig.getName());
        System.out.println(personConfig.getUrl());
        return personConfig.getName();
    }
}
