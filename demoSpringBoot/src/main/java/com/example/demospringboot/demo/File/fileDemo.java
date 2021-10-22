package com.example.demospringboot.demo.File;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class fileDemo {
    public static void main(String[] args) throws IOException {
        String fileName = "createFile.java";
        Path path = Paths.get(fileName);
        Files.write(path,"Hello World -创建文件!!".getBytes(StandardCharsets.UTF_8));
    }
}
