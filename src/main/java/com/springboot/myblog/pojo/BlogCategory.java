package com.springboot.myblog.pojo;

import lombok.Data;

/**
 * @ClassName BlogCategory
 * @Description blog category
 * @Author 2985062714@qq.com
 * @Date 2019/8/6 16:28
 * @Version 1.0
 */
@Data
public class BlogCategory {

    /* 分类id */
    private Integer categoryId;

    /* 分类名 */
    private String categoryName;

    /* 分类图标 */
    private String categoryIcon;

    /* 分类排名 */
    private Integer categoryRank;

    private Byte isDeleted;
}
