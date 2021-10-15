package com.example.demospringboot;

public class People {
    private String name;

    private Integer age = 18;

    public People(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer test(){
        return this.age;
    }
}
