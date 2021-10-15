package com.example.demospringboot.demo.concurrent;

import java.util.ArrayList;

public class TestAtomicity {
    //原子性 定义共享变量
    public static int num = 0;
    public static void main(String[] args) throws InterruptedException {
        Runnable increment = ()->{
            for (int i = 0; i < 1000; i++) {
                num++;
            }
        };
        ArrayList<Thread> arrayList = new ArrayList();
        for (int i = 0; i < 5; i++) {
            Thread t = new Thread(increment);
            t.start();
            arrayList.add(t);
        }
        for (Thread thread : arrayList) {
//            join() 的作用：让“主线程”等待“子线程”结束之后才能继续运行
            thread.join();
        }
        System.out.println("num:"+num);

        Runnable test = ()->{
            System.out.println("hello");
        };
        test.run();

    }
}
