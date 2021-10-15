package com.example.demospringboot.demo.BaseType;

import org.springframework.boot.configurationprocessor.json.JSONException;
import org.springframework.boot.configurationprocessor.json.JSONObject;
import org.springframework.boot.configurationprocessor.json.JSONTokener;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        int a = 3;
        int b = 10;
        String s = "abc";
        int[] arr = {1, 2, 5, 10};
        for (int i = 0; i < arr.length; i++) {
//            System.out.println(arr[i]);
        }
        Iterator<Integer> iterator = Arrays.stream(arr).iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
//        System.out.println(s.equals(a));
        ArrayList<String> arrayList = new ArrayList();
        arrayList.add("a");
//        for (int i = 0; i < 10; i++) {
//            System.out.println(new Main().testSwitch(i));
//        }
        JSONObject jsonObject = new JSONObject();
        try {
            jsonObject.put("a", "1");
        } catch (JSONException e) {

        }
        HashMap<String, Integer> hashMap = new HashMap<>();
        hashMap.put("b", 3);
        hashMap.put("c", 5);
        System.out.println(hashMap);
//        遍历
        for (Map.Entry<String, Integer> entry:hashMap.entrySet()){
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }
        System.out.println(jsonObject);
        File directory = new File("..");
        try {
            System.out.println(directory.getCanonicalPath());
        } catch (IOException e) {

        }
        File fileName = new File("http://inneradx.ad.wxtest.com/cdn/direct/162677246973.mp4".trim());
        System.out.println(fileName.getName());
        System.out.println(fileName.getName().substring(0,fileName.getName().lastIndexOf(".")));
        File existFile = new File("/Users/difuwei/txt/34/11.txt");
        System.out.println(existFile.exists());
        try{
            Files.copy(Paths.get("/Users/difuwei/txt/34/34.txt"), Paths.get("/Users/difuwei/txt/34/11.txt"));
        }catch (Exception e){

        }
        System.out.println(existFile.exists());

    }

    public int testSwitch(int n){
        switch (n){
            case 1:
            case 2:
            case 3:
                return 100;
        }
        return n;
    }
}
