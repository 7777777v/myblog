package com.springboot.myblog.pojo;

import lombok.Data;

import java.util.Date;

/**
 * @ClassName BlogTagRelation
 * @Description blog tag relation
 * @Author 2985062714@qq.com
 * @Date 2019/8/6 17:13
 * @Version 1.0
 */
@Data
public class BlogTagRelation {

    /* 关系id */
    private Integer relationId;

    /* 博客id */
    private Integer blogId;

    /* 标签id */
    private Integer tagId;

    /* 创建日期 */
    private Date createTime;

}
