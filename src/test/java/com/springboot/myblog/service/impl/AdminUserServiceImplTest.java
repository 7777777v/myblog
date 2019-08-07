package com.springboot.myblog.service.impl;

import com.springboot.myblog.pojo.AdminUser;
import com.springboot.myblog.service.AdminUserService;
import com.springboot.myblog.util.MD5Util;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@SpringBootTest
@RunWith(SpringRunner.class)
public class AdminUserServiceImplTest {

    @Autowired
    private AdminUserService adminUserService;

    private final String username = "123456";
    private String password = "123456";

    @Test
    public void login() {
        AdminUser adminUser = adminUserService.login(username,password);
        System.out.println("adminUser = " + adminUser);
    }

    @Test
    public void getUserDetailById() {
        AdminUser adminUser = adminUserService.getUserDetailById(1);
        System.out.println("adminUser = " + adminUser);
    }

    @Test
    public void updatePassword() {
    }

    @Test
    public void updateName() {
    }
}