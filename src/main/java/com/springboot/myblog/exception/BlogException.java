package com.springboot.myblog.exception;

import com.springboot.myblog.enums.ResultEnum;

/**
 * @ClassName BlogException
 * @Description 自定义异常
 * @Author 2985062714@qq.com
 * @Date 2019/8/6 23:10
 * @Version 1.0
 */
public class BlogException extends RuntimeException{

    private Integer code;

    public BlogException(ResultEnum resultEnum){
        super(resultEnum.getMessage());
        this.code = resultEnum.getCode();
    }

    public BlogException(Integer code ,String message){
        super(message);
        this.code = code;
    }
}
