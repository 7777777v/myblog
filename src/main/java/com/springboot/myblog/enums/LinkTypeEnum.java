package com.springboot.myblog.enums;

import lombok.Getter;

@Getter
public enum LinkTypeEnum {

    /* 链接类型枚举 */
    FRIENDLY_LINK(0,"友情链接"),

    RECOMMENDED_LINKS(1, "推荐链接"),

    PERSONAL_WEBSITE(2,"个人网站"),
    ;
    private Integer code;

    private String message;

    LinkTypeEnum(Integer code,String message){
        this.message = message;
        this.code = code;
    }
}
