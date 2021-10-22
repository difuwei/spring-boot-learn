package com.example.demospringboot.demo.BaseType;

import java.util.HashMap;
import java.util.Map;

public class ArrayTest {
    public static void main(String[] args) {
        Map<String, String>[] arr1 = new Map[2];
        Map<String, String> map = new HashMap<String, String>();
        map.put("name","xiaoming");
        map.put("name1","xiaoli");
//        arr1[1]=map;
        Map<String, String> map1 = new HashMap();
        map1 = arr1[1];
        System.out.println(map1);
//        System.out.println(arr1[1]);
    }
}
