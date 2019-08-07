package com.springboot.myblog.enums;

import lombok.Getter;

/**
 * @ClassName AdminUserStatusEnum
 * @Description 用户状态枚举
 * @Author 2985062714@qq.com
 * @Date 2019/8/6 22:53
 * @Version 1.0
 */
@Getter
public enum  AdminUserStatusEnum {

    UNLOCK(0,"未锁定"),

    LOCKED(1,"已锁定"),

    ;
    private Integer code;

    private String message;

    AdminUserStatusEnum(Integer code,String message){
        this.message = message;
        this.code = code;
    }
}
