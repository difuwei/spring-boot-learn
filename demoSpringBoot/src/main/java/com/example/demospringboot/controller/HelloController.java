package com.example.demospringboot.controller;

import com.example.demospringboot.config.TestGetConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @RequestMapping("/hello")
    @ResponseBody
    public String Hello(){
        return "hello";
    }
}
