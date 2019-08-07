package com.springboot.myblog.enums;

import lombok.Getter;

@Getter
public enum EnableCommentStatusEnum {

    /* 能否评论枚举 */

    ENABLE(0,"允许评论"),

    DISABLE(1,"禁止评论"),
    ;

    private Integer code;

    private String message;

    EnableCommentStatusEnum(Integer code,String message){
        this.message = message;
        this.code = code;
    }

}
