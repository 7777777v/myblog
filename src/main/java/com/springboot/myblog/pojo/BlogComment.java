package com.springboot.myblog.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.util.Date;

/**
 * @ClassName BlogComment
 * @Description blog comment
 * @Author 2985062714@qq.com
 * @Date 2019/8/6 16:32
 * @Version 1.0
 */
@Data
public class BlogComment {

    /* 评论id */
    private Integer commentId;

    /* 博客id */
    private Integer blogId;

    /* 评论者 */
    private String commentator;

    /* 创建时间 */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date commentCreateTime;

    /* 评论者ip */
    private String commentatorIp;

    /* 回复信息 */
    private String replyBody;

    /* 回复时间 */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date replyCreateTime;

    /* 评论状态 */
    private Byte commentStatus;

    private Byte isDeleted;

}
