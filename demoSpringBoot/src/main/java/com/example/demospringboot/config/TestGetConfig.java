package com.example.demospringboot.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

@Component
public class TestGetConfig {
    @Autowired
    private Environment environment;
    public String getName(){
        String name = environment.getProperty("name");
        return  name;
    }
    public Object getProfiles(){
        return environment.getActiveProfiles();
    }
}
