package com.springboot.myblog.pojo;

import lombok.Data;

/**
 * @ClassName BlogTagCount
 * @Description blog count
 * @Author 2985062714@qq.com
 * @Date 2019/8/6 16:24
 * @Version 1.0
 */
@Data
public class BlogTagCount {

    /* 标签id */
    private Integer tagId;

    /* 标签名 */
    private String tagName;

    /* 标签数 */
    private Integer tagCount;
}
