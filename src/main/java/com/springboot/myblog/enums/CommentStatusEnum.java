package com.springboot.myblog.enums;

import lombok.Getter;

@Getter
public enum CommentStatusEnum {

    /* 评论状态枚举 */

    NOT_PASS(0,"审核未通过"),

    PASS(1, "审核通过"),
    ;

    private Integer code;

    private String message;

    CommentStatusEnum(Integer code,String message){
        this.message = message;
        this.code = code;
    }
}
