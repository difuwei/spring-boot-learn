package com.example.demospringboot.demo.BaseType;

import com.alibaba.druid.sql.visitor.functions.Length;
import org.springframework.util.DigestUtils;
import tk.mybatis.mapper.util.StringUtil;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Random;
import java.util.TimeZone;

public class DateType {
    public static void main(String[] args) throws ParseException {
//        System.out.println(LocalDate.parse("2021-07-02",DateTimeFormatter.ofPattern("yyyy-MM-dd")));
//        System.out.println(SimpleDateF);
//        SimpleDateFormat form = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//        Date date = new Date();
//        System.out.println(form.format(date.));
//        String s = "1988-04-16";
//        Date date = new Date();
//        DateFormat df = new SimpleDateFormat("hh:mm:ss");
//        s = s + df(date);
        String ss = "2015-07-03 08:02:01";
        System.out.println(ss.length());
        Long d = new SimpleDateFormat("yyyy-MM-dd").parse("2015-07-03 08:02:01").getTime();
        System.out.println(LocalDateTime.ofEpochSecond(d/1000,0, ZoneOffset.ofHours(8)));
        System.out.println(d);
        System.out.println(Long.parseLong(String.valueOf(d)));
//        System.out.println(new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").parse(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(Long.parseLong(String.valueOf(d)))));
        System.out.println(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date(Long.parseLong(String.valueOf(d)))));
            System.out.println(DigestUtils.md5DigestAsHex(Long.toString(System.currentTimeMillis()+(new Random().nextInt(1000)+1)).getBytes()));
        System.out.println(DigestUtils.md5DigestAsHex(Long.toString(System.currentTimeMillis()).getBytes()).substring(8,24));
        //获取时间戳
        System.out.println(new SimpleDateFormat("yyyy-MM-dd").parse("2015-07-03").getTime());
        Long startTime = new SimpleDateFormat("yyyy-MM-dd").parse("2015-07-03").getTime();
        System.out.println(LocalDateTime.ofEpochSecond(startTime/1000,0, ZoneOffset.ofHours(8)));
        System.out.println(LocalDateTime.ofEpochSecond(startTime/1000+86399,0, ZoneOffset.ofHours(8)));
        // 传入时分秒
//        if (material.getStart_time().length()>10){
//            tDspNewMaterialInfo.setStartTime(LocalDateTime.parse(material.getStart_time(),DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));
//        }else {
//            //只传年月日
//            Long startTime = new SimpleDateFormat("yyyy-MM-dd").parse(material.getStart_time()).getTime();
//            tDspNewMaterialInfo.setStartTime(LocalDateTime.ofEpochSecond(startTime/1000,0, ZoneOffset.ofHours(8)));
//        }
//        if (material.getEnd_time().length()>10){
//            tDspNewMaterialInfo.setEndTime(LocalDateTime.parse(material.getEnd_time(),DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));
//        }else {
//            Long endTime = new SimpleDateFormat("yyyy-MM-dd").parse(material.getEnd_time()).getTime();
//            tDspNewMaterialInfo.setEndTime(LocalDateTime.ofEpochSecond(endTime/1000,0, ZoneOffset.ofHours(8)));
//        }

    }
}
