package com.example.demospringboot.demo.Thread.threadPool;

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class ScheduledThreadPoolExec {
    public static void main(String[] args) {
//        Timer定时器
        Timer timer = new Timer();
//        timer.schedule(new TimerTask() {
//            @Override
//            public void run() {
//                System.out.println(new Date());
//            }
//        },100,3000);


        ScheduledThreadPoolExecutor scheduled = new ScheduledThreadPoolExecutor(3);
//        scheduleAtFixedRate 和 scheduleWithFixedDelay 是我们最常用的两个方法
//        ScheduledThreadPoolExecutor 线程最多为核心线程，最大线程数不起作用，因为 DelayedWorkQueue 是无界队列
//        如果任务执行时间超过周期
//        scheduleAtFixedRate:下一次任务会立刻运行
//        scheduleWithFixedDelay :无论执行时间是多少，其结果都是在执行完毕后，停顿固定的时间，然后执行下一次任务
        scheduled.scheduleAtFixedRate(new Runnable() {
            @Override
            public void run() {
                System.out.println(new Date());
            }
        },0, 4,TimeUnit.SECONDS);
    }
}
