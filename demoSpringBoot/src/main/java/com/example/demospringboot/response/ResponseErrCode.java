package com.example.demospringboot.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
@Getter
@AllArgsConstructor
public enum ResponseErrCode implements IBaseResponseCode{
    SUCCESS(400, "test-fail");
    private int code;
    private String msg;
}
