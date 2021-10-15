package com.example.demospringboot.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum BaseResponseCode implements IBaseResponseCode{
    SUCCESS(200, "成功");
    private int code;
    private String msg;
}
