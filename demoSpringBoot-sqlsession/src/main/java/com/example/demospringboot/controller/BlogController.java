package com.example.demospringboot.controller;

import com.example.demospringboot.factory.SqlSessionFactoryUtil;
import com.example.demospringboot.pojo.Blog;
import com.example.demospringboot.mapper.BlogMapper;
import org.apache.ibatis.session.SqlSession;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/blog")
public class BlogController {
    // sqlsession
    @RequestMapping("/getBlogSession/{id}")
    public Blog getBlogSession(@PathVariable String id){
        SqlSession sqlSession = SqlSessionFactoryUtil.getSqlSession();
        BlogMapper blogMapper = sqlSession.getMapper(BlogMapper.class);
        Blog blog = blogMapper.selectBlog111(Integer.parseInt(id));
        return blog;
    }
}
