package com.example.demospringboot.demo.Thread;

import java.util.Date;
import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicInteger;

public class ThreadPool {
    //线程池初始化常量
    private static final int CORE_POOL_SIZE = 5;
    private static final int MAX_POOL_SIZE = 6;
    private static final int QUEUE_CAPACITY = 100;
    private static final Long KEEP_ALIVE_TIME = 1L;

    public static void main(String[] args) {
//        AtomicInteger i = new AtomicInteger();
//        i.incrementAndGet();
        // runnable
        Runnable myRunnable = new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName() + " Start. Time = " + new Date());
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName() + " End. Time = " + new Date());
            }
        };
        //使用阿里巴巴推荐的创建线程池的方式
        //通过ThreadPoolExecutor构造函数自定义参数创建
//        AbortPolicy ：抛出 RejectedExecutionException来拒绝新任务的处理
//        CallerRunsPolicy调用执行自己的线程运行任务，直接运行
//        DiscardPolicy 不处理新任务，直接丢弃掉
//        DiscardOldestPolicy：此策略将丢弃最早的未处理的任务请求
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(CORE_POOL_SIZE,MAX_POOL_SIZE,KEEP_ALIVE_TIME,TimeUnit.SECONDS,new SynchronousQueue<Runnable>(),new ThreadPoolExecutor.CallerRunsPolicy());
        for (int i = 0; i < 10; i++) {
//            System.out.println(threadPoolExecutor.getActiveCount());
            threadPoolExecutor.execute(myRunnable);
        }
        threadPoolExecutor.shutdown();
//        ExecutorService executorService = Executors.newFixedThreadPool(10);
//        executorService.submit(myRunnable);
//        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor();
    }
}

