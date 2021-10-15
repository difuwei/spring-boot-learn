package com.example.demospringboot.demo.concurrent;

// 测试并发编程中的有序性，java中有代码重排
public class TestOrder {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName());
    }
}
