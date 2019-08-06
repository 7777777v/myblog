package com.springboot.myblog.pojo;

import lombok.Data;

/**
 * @ClassName BlogLink
 * @Description blog link
 * @Author 2985062714@qq.com
 * @Date 2019/8/6 16:51
 * @Version 1.0
 */
@Data
public class BlogLink {

    /* 链接id */
    private Integer linkId;

    /* 链接类型 */
    private Byte linkType;

    /* 连接名 */
    private String linkName;

    /* 链接地址 */
    private String linkUrl;
}
