package com.example.demospringboot.demo.Http;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RequestCallback;
import org.springframework.web.client.RestTemplate;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;

public class restTemplateTest {
    public static void main(String[] args) {
        ResponseEntity<String> responseEntity = new RestTemplate().getForEntity("http://www.baidu.com",String.class);
        System.out.println(responseEntity.getStatusCode());
        System.out.println("====");
        System.out.println(responseEntity.getBody());
        System.out.println("====");
        System.out.println(responseEntity.getStatusCodeValue());

        // 写入文件
        RequestCallback requestCallback = clientHttpRequest -> clientHttpRequest.getHeaders().setAccept(Arrays.asList(MediaType.APPLICATION_OCTET_STREAM,MediaType.ALL));
        new RestTemplate().execute("http://www.baidu.com", HttpMethod.GET,requestCallback,clientHttpResponse -> {
            Files.copy(clientHttpResponse.getBody(), Paths.get("/Users/difuwei/txt/34/34.txt"));
            return null;
        });

    }
}
