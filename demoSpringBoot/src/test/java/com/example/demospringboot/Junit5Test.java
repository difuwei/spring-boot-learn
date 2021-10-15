package com.example.demospringboot;

import org.junit.jupiter.api.*;
import org.junit.jupiter.api.Test;

@DisplayName("测试类")
public class Junit5Test {
    @BeforeEach
    void testBefore(){
        System.out.println("测试开始前：");
    }
    @DisplayName("5test")
    @Test
    void test5Unit(){
        System.out.println("1111");
    }
    @AfterEach
    void testAfter(){
        System.out.println("finish");
    }

    @DisplayName("测试断言")
    @Test
    void testSimpleAssert(){
        int cal = cal(4,4);
        Assertions.assertEquals(8,cal,"失败");
    }

    int cal(int i,int j){
        return i+j;
    }
}
