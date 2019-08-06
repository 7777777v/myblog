package com.springboot.myblog.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.util.Date;

/**
 * @ClassName LoginRecord
 * @Description login record
 * @Author 2985062714@qq.com
 * @Date 2019/8/6 15:45
 * @Version 1.0
 */
@Data
public class LoginRecord {

    /* 记录id */
    private Integer recordId;

    /* 上线时间 */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date loginTime;

    /* 下线时间 */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date logoutTime;

    /* 在线时间 */
    private Long onlineTime;

    /* 用户表关联id */
    private Integer userId;


}
