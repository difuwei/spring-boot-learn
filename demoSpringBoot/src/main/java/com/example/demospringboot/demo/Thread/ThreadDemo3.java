package com.example.demospringboot.demo.Thread;

public class ThreadDemo3 implements Runnable{
    /**
     * When an object implementing interface {@code Runnable} is used
     * to create a thread, starting the thread causes the object's
     * {@code run} method to be called in that separately executing
     * thread.
     * <p>
     * The general contract of the method {@code run} is that it may
     * take any action whatsoever.
     *
     * @see Thread#run()
     */
    private int a;
    @Override
    public void run() {
        System.out.println("threaddemo3 "+Thread.currentThread().getName()+" runing ");
    }

//    在这种方式下，多个线程可以共享同一个target对象，
//    所以非常适合多个相同线程来处理同一份资源的情况，
//    从而可以将CPU、代码和数据分开，形成清晰的模型，较好地体现了面向对象的思想
    public static void main(String[] args) {
        ThreadDemo3 threadDemo3 = new ThreadDemo3();
        new Thread(threadDemo3,"aaa").start();
    }
}
