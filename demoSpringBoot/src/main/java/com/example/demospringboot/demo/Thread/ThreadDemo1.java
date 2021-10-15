package com.example.demospringboot.demo.Thread;

public class ThreadDemo1 {
    private int count = 0;
    public void add(){
        for (int i=0;i<100;i++){
            try{
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            count ++;
        }
    }

    public static void main(String[] args) throws InterruptedException {
        //多线程下成员变量线程不安全 count的最终值不一定等于200，可能会小于200
        ThreadDemo1 threadDemo = new ThreadDemo1();
        new Thread(()->threadDemo.add()).start();
        new Thread(()->threadDemo.add()).start();
        Thread.sleep(1000);
        System.out.println(threadDemo.count);



    }

}
