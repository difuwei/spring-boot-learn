package com.example.demospringboot.demo.Thread;

//继承 Thread方式 重写run方法，run()方法称为执行体
public class ThreadDemo2 extends Thread{
    private String threadName;
    public void run(){
        System.out.println(currentThread().getName()+"运行了threaddemo2");
        System.out.println(ThreadDemo2.currentThread().getName());
    }
    //有参构造方法
    public ThreadDemo2(String threadName){
        //为线程自定义命名
        super(threadName);
    }
    //getName()方法返回调用该方法的线程的名字
    //无参构造方法
    public ThreadDemo2(){
        this.threadName = Thread.currentThread().getName();
    }

    public static void main(String[] args) {
        new ThreadDemo2("线程名字1").start();
//        new ThreadDemo2().start();

    }
}
