package com.springboot.myblog.form;

import lombok.Data;

import javax.validation.constraints.NotEmpty;

/**
 * @ClassName AdminUserForm
 * @Description 用户登陆表单验证
 * @Author 2985062714@qq.com
 * @Date 2019/8/6 22:59
 * @Version 1.0
 */
@Data
public class AdminUserForm {

    /* 账号 */
    @NotEmpty(message = "账号必填")
    private String userName;

    /* 密码 */
    @NotEmpty(message = "密码必填")
    private String password;

    /* 验证码 */
    @NotEmpty(message = "验证码必填")
    private String verifyCode;

}
