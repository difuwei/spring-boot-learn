package com.example.demospringboot.controller;

import com.example.demospringboot.pojo.Resource;
import com.example.demospringboot.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

//@Controller
@RestController  // RestController=Controller+ResponseBody
@RequestMapping("/user")
public class UserController {
    @Autowired
    private Resource resource;
    @RequestMapping("/getUser")
//    @ResponseBody
    public User Hello(){
        User user = new User();
        user.setAge(18);
        user.setName("a");
        user.setBirthday(new Date());
        user.setPassword("12345");
        return user;
    }
    @RequestMapping("/getResource")
    public Resource getResource(){
        return this.resource;
    }
}
