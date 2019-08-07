package com.springboot.myblog.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.util.Date;

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
    private Integer blogId;

    /* 博客标题 */
    private String blogTitle;

    /* 自定义url路径 */
    private String blogSubUrl;

    /* 博客封面图片 */
    private String blogCoverImg;

    /* 博客分类id */
    private Integer blogCategoryId;

    /* 博客标签 */
    private String blogTags;

    /* 博客状态 0-草稿、1-发布 */
    private Byte blogStatus;

    /* 阅读量 */
    private Long blogViews;

    /* 是否允许评论 0-允许 1-不允许 */
    private Byte enableComment;

    /* 是否删除 0-否、1-是*/
    private Byte isDeleted;

    /* 创建日期 */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date createTime;

    /* 修改日期 */
    private Date updateTime;

    /* 日志内容 */
    private String blogContent;
}
