package com.springboot.myblog.vo;

import lombok.Data;

/**
 * @ClassName ResultVo
 * @Description http请求返回最外层对象
 * @Author 2985062714@qq.com
 * @Date 2019/8/6 22:56
 * @Version 1.0
 */
@Data
public class ResultVo<T> {

    /* 返回消息码 */
    private Integer code;

    /* 返回消息 */
    private String message;

    /* 返回数据 */
    private T data;
}
