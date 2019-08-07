package com.springboot.myblog.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.util.Date;

/**
 * @ClassName BlogTag
 * @Description blog tag
 * @Author 2985062714@qq.com
 * @Date 2019/8/6 16:19
 * @Version 1.0
 */
@Data
public class BlogTag {

    /* 标签id */
    private Integer tagId;

    /* 标签名 */
    private String tagName;

    /* 是否删除 */
    private Byte isDeleted;

    /* 创建时间 */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date createTime;
}
