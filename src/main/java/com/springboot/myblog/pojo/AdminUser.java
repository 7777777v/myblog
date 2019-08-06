package com.springboot.myblog.pojo;

import lombok.Data;

import java.util.List;

/**
 * @ClassName AdminUser
 * @Description admin
 * @Author 2985062714@qq.com
 * @Date 2019/8/6 15:39
 * @Version 1.0
 */
@Data
public class AdminUser {

    /** 管理员id */
    private Integer adminUserId;

    /** 登录用户名 */
    private String loginUserName;

    /** 登录密码 */
    private String loginPassword;

    /** 昵称 */
    private String nickName;

    /** 用户头像 */
    private String userPic;

    /** 登录记录 */
    private List<LoginRecord> loginRecords;
}
