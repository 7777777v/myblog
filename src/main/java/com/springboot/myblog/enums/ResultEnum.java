package com.springboot.myblog.enums;

import lombok.Getter;

/* 提示消息 */
@Getter
public enum ResultEnum {

    DATA_NOT_FOUND(-1,"未找到数据"),

    PARAM_ERROR(-2,"参数不正确"),

    VERIFY_CODE_ERROR(-3,"验证码错误"),

    USER_NOT_EXIST(-4,"用户不存在"),
    ;
    private Integer code;

    private String message;

    ResultEnum(Integer code,String message){
        this.code = code;
        this.message = message;
    }
}
