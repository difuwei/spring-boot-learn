package com.example.demospringboot.service.Impl;

import com.example.demospringboot.pojo.Blog;
import com.example.demospringboot.util.mapper.BlogMapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class BlogMapperImpl implements BlogService {
    @Resource
    private BlogMapper blogMapper;
    @Override
    public Blog selectBlog(Integer id) {
        Blog blog =  blogMapper.selectBlog(id);
        return  blog;
    }
    public int insertBlog(Blog blog){
        int rec = blogMapper.insertBlog(blog);
        return  rec;
    }

    @Override
    public int batchInsertBlog(List<Blog> blogList) {
        int rec = blogMapper.batchInsertBlog(blogList);
        return  rec;
    }

    @Override
    public int batchInsertBlogSecond(List<Blog> blogList) {
        int rec = blogMapper.batchInsertBlogSecond(blogList);
        return  rec;
    }
}
