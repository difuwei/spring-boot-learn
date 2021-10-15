package com.example.demospringboot.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Blog {
    private Integer id;
    private String userName;
    private Integer userAge;

    public Blog(Blog blog) {
        this.setId(blog.getId());
        this.setUserName(blog.getUserName());
        this.setUserAge(blog.getUserAge());
    }

}
