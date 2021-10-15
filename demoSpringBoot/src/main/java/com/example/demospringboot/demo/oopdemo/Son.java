package com.example.demospringboot.demo.oopdemo;

public class Son extends Father{
    public void say(){
        System.out.println("i am son");
    }
    public void play(){
        System.out.println("son play");
    }

    public static void main(String[] args) {
        Son son1 = new Son();
        son1.say();
        son1.go();
    }



}
