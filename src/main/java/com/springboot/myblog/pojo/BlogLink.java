package com.springboot.myblog.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.util.Date;

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

    /* 链接描述 */
    private String linkDescription;

    /* 链接排名 */
    private Integer linkRank;

    private Byte isDeleted;

    /* 创建日期 */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date createTime;

}
