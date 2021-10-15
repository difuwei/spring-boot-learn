package com.example.demospringboot.demo.concurrent;

public class TestVisibility {
    //可见性
    //1、创建共享变量，创建一个线程读取变量，2、创建另外一个线程修改共享变量
    //共享变量
    public static Boolean flag = true;
    public static void main(String[] args) throws InterruptedException {
        new Thread(()->{
            int i =0;
            while (flag){
                System.out.println(i++);
            }
        }).start();
        Thread.sleep(10);
        new Thread(()->{
            flag = false;
            System.out.println("线程修改了变量值");
        }).start();
    }
}
