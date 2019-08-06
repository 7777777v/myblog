package com.springboot.myblog.pojo;

import lombok.Data;

/**
 * @ClassName Blog
 * @Description blog
 * @Author 2985062714@qq.com
 * @Date 2019/8/6 15:49
 * @Version 1.0
 */
@Data
public class Blog {

    /* 博客id */
    private Long blogId;

    /* 博客标题 */
    private String blogTitle;

    /* */
    private String blogSubUrl;

    /* 博客封面图片 */
    private String blogCoverImg;

    /* 博客分类id */
    private Integer blogCategoryId;
}
