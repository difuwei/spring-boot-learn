package com.example.demospringboot.controller;

import com.example.demospringboot.pojo.Blog;
import com.example.demospringboot.service.Impl.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.xml.transform.Source;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.BlockingQueue;

@RestController
@RequestMapping("/blog")
public class BlogController {
    @Autowired()
    private BlogService blogService ;
//    http://localhost:8080/blog/getBlog/1
    @RequestMapping("/getBlog/{id}")
    //实现类的方式
    public Blog getBlog(@PathVariable String id){
//        return Integer.parseInt(id);
        Blog blog = blogService.selectBlog(Integer.parseInt(id));

        return blog;
    }
    @RequestMapping("/addBlog")
    public int insertBlog(){
        Blog blog = new Blog();
        blog.setUserAge(24);
//        blog.setUserName("");
        Blog blog1 = new Blog();
        blog1.setUserAge(25);
        blog1.setUserName("aa2");
        List<Blog> blogList = new ArrayList();
        blogList.add(blog);
        blogList.add(blog1);

        int n = blogService.batchInsertBlog(blogList);
//        int n = blogService.batchInsertBlogSecond(blogList);
//        int n = blogService.insertBlog(blog);
        return n;
    }

//    http://localhost:8080/blog/params?name=di
    @RequestMapping("/params")
    public String params(@RequestParam(name = "name",defaultValue = "")String name){
        return name;
    }
    // sqlsession
//    @RequestMapping("/getBlogSession")
//    public Blog getBlogSession(){
//        SqlSession sqlSession = SqlSessionFactoryUtil.getSqlSession();
//        BlogMapper blogMapper = sqlSession.getMapper(BlogMapper.class);
//        Blog blog = blogMapper.selectBlog();
//        return blog;
//    }
}
