package com.springboot.myblog.dao;

import com.springboot.myblog.pojo.AdminUser;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@SpringBootTest
@RunWith(SpringRunner.class)
public class AdminUserMapperTest {
    @Autowired
    private AdminUserMapper adminUserMapper;

    @Test
    public void testUserLogin(){
        AdminUser adminUser = adminUserMapper.userLogin("123456","e10adc3949ba59abbe56e057f20f883e");
        System.out.println("adminUser = " + adminUser);
    }
}