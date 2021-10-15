package com.example.demospringboot.demo.concurrent;

public class demo1sync {
    public static void main(String[] args) {
        new MyThread().run();
        new MyThread().run();
        System.out.println(MyThread.activeCount());
    }
}

class MyThread extends Thread{

    public void run(){
        synchronized (MyThread.class){
            System.out.println(getName()+"线程1");
        }
        synchronized (new Object()){
            System.out.println(getName()+"线程2");
        }
    }

}
