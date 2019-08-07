package com.springboot.myblog.dao;

import com.springboot.myblog.pojo.AdminUser;
import org.springframework.stereotype.Component;

@Component
public interface AdminUserMapper {

    /* 用户注册 */
    int insert(AdminUser record);

    /* 用户登录 */
    AdminUser userLogin(String userName,String password);

    /* 通过id获取用户信息 */
    AdminUser selectByPrimaryKey(Integer adminUserId);

    /* 通过id修改用户信息 */
    int updateByPrimaryKeySelective(AdminUser record);

    /* 通过id修改用户密码 */
    int updatePasswordById(Integer userId,String password);

}
