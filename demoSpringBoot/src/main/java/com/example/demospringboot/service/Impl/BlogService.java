package com.example.demospringboot.service.Impl;

import com.example.demospringboot.pojo.Blog;

import java.util.List;

public interface BlogService {
      Blog selectBlog(Integer id);
      int insertBlog(Blog blog);
      int batchInsertBlog(List<Blog> blogList);
      int batchInsertBlogSecond(List<Blog> blogList);
}
