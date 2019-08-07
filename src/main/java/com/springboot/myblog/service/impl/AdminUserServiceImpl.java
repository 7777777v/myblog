package com.springboot.myblog.service.impl;

import com.springboot.myblog.dao.AdminUserMapper;
import com.springboot.myblog.enums.ResultEnum;
import com.springboot.myblog.pojo.AdminUser;
import com.springboot.myblog.service.AdminUserService;
import com.springboot.myblog.util.MD5Util;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

/**
 * @ClassName AdminUserServiceImpl
 * @Description admin user service
 * @Author 2985062714@qq.com
 * @Date 2019/8/6 22:26
 * @Version 1.0
 */
@Service
public class AdminUserServiceImpl implements AdminUserService {

    @Autowired
    private AdminUserMapper userMapper;

    /* 用户登陆 */
    @Override
    public AdminUser login(String userName, String password) {
        if (StringUtils.isEmpty(userName) || StringUtils.isEmpty(password))
            return null;
        String pwdMD5 = MD5Util.MD5Encode(password,"UTF-8");
        AdminUser adminUser = userMapper.userLogin(userName,pwdMD5);
        return adminUser;
    }

    /* 获取用户信息 */
    @Override
    public AdminUser getUserDetailById(Integer loginUserId) {
        if (loginUserId == null)
            return null;
        AdminUser adminUser = userMapper.selectByPrimaryKey(loginUserId);
        return adminUser;
    }

    /* 修改用户密码 */
    @Override
    public Boolean updatePassword(Integer loginUserId, String originalPassword, String newPassword) {
        if (StringUtils.isEmpty(loginUserId) || StringUtils.isEmpty(originalPassword) || StringUtils.isEmpty(newPassword))
            return false;
        AdminUser adminUser = userMapper.selectByPrimaryKey(loginUserId);
        /* 存在用户则修改 */
        if (adminUser != null){
            String originalPasswordMd5 = MD5Util.MD5Encode(originalPassword,"UTF-8");
            if (originalPasswordMd5.equals(adminUser.getLoginPassword())){
                /* 密码校验成功则修改密码 */
                String newPasswordMD5 = MD5Util.MD5Encode(newPassword,"UTF-8");
                int result = userMapper.updatePasswordById(loginUserId,newPasswordMD5);
                return result > 0;
            }
        }
        return false;
    }

    /* 修改用户名称信息 */
    @Override
    public Boolean updateName(Integer loginUserId, String loginUserName, String nickName) {
        if (loginUserId == null || StringUtils.isEmpty(loginUserName) || StringUtils.isEmpty(nickName))
            return false;
        AdminUser adminUser = userMapper.selectByPrimaryKey(loginUserId);
        if (adminUser != null){
            adminUser.setLoginUserName(loginUserName);
            adminUser.setNickName(nickName);
            int result = userMapper.updateByPrimaryKeySelective(adminUser);
            return result > 0;
        }
        return false;
    }
}
