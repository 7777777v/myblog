package com.springboot.myblog.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.util.Date;

/**
 * @ClassName BlogConfig
 * @Description blog config
 * @Author 2985062714@qq.com
 * @Date 2019/8/6 16:48
 * @Version 1.0
 */
@Data
public class BlogConfig {

    /* 配置id */
    private Integer configId;

    /* 配置名 */
    private String configName;

    /* 配置值 */
    private String configValue;

    /* 创建时间 */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date createTime;

    /* 更新时间 */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date updateTime;
}
