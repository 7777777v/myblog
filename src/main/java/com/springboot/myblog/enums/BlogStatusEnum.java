package com.springboot.myblog.enums;

import lombok.Getter;

@Getter
public enum BlogStatusEnum {

    /* 博客状态枚举 */

    DRAFT(0,"草稿"),

    PUBLISH(0,"发布"),

    ;

    private Integer code;

    private String message;

    BlogStatusEnum(Integer code,String message){
        this.message = message;
        this.code = code;
    }
}
