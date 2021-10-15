package com.example.demospringboot.util.mapper;

import com.example.demospringboot.pojo.Blog;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface BlogMapper {
//    @Select("select * from blog where id= 2")
    Blog selectBlog(Integer id);
    int insertBlog(Blog blog);
    int batchInsertBlog(@Param("blogList") List<Blog> blogList);
    int batchInsertBlogSecond(@Param("blogList") List<Blog> blogList);
}
