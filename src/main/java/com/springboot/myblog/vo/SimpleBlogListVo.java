package com.springboot.myblog.vo;

import lombok.Data;

import java.io.Serializable;

/**
 * @ClassName SimpleBlogListVo
 * @Description 简介日志列表
 * @Author 2985062714@qq.com
 * @Date 2019/8/7 16:16
 * @Version 1.0
 */
@Data
public class SimpleBlogListVo implements Serializable {

    private Long blogId;

    private String blogTitle;
}
