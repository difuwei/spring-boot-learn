package com.example.demospringboot.tasks;

import org.springframework.scheduling.annotation.Scheduled;

import java.util.Date;

public class Task {
    @Scheduled(fixedRate = 3000)
    public void currentTime(){
        System.out.println(new Date());
    }
}
