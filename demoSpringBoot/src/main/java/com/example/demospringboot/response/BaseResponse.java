package com.example.demospringboot.response;

import lombok.Data;

@Data
public class BaseResponse<T> {
    private int code;
    private String msg;
    private T data;

    public static <T> BaseResponse<T> success(T data){
        BaseResponse baseResponse = new BaseResponse();
        baseResponse.setResult(BaseResponseCode.SUCCESS);
        baseResponse.setData(data);
        return baseResponse;
    }

    public static <T> BaseResponse<T> fail(int code,String msg){
        BaseResponse baseResponse = new BaseResponse();
        baseResponse.setCode(code);
        baseResponse.setMsg(msg);
        return baseResponse;
    }
    public static <T> BaseResponse<T> fail(IBaseResponseCode baseResponseCode){
        BaseResponse baseResponse = new BaseResponse();
        baseResponse.setResult(baseResponseCode);
        return baseResponse;
    }

    private void setResult(IBaseResponseCode baseResponse){
        this.code = baseResponse.getCode();
        this.msg = baseResponse.getMsg();
    }

}
