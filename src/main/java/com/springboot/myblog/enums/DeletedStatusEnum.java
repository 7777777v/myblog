package com.springboot.myblog.enums;

import lombok.Getter;

/**
 * @ClassName DeletedStatusEnum
 * @Description 删除状态枚举
 * @Author 2985062714@qq.com
 * @Date 2019/8/7 15:05
 * @Version 1.0
 */
@Getter
public enum DeletedStatusEnum {

    YES(0,"否"),

    NO(1,"是"),

    ;

    private Integer code;

    private String message;

    DeletedStatusEnum(Integer code,String message){
        this.message = message;
        this.code = code;
    }
}
