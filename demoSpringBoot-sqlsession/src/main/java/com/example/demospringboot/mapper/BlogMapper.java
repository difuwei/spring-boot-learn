package com.example.demospringboot.mapper;

import com.example.demospringboot.pojo.Blog;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface BlogMapper {
    Blog selectBlog111(Integer id);
}
