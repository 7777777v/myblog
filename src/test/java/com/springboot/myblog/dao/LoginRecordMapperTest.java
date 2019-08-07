package com.springboot.myblog.dao;

import com.springboot.myblog.pojo.LoginRecord;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;
import java.util.List;

import static org.junit.Assert.*;

@SpringBootTest
@RunWith(SpringRunner.class)
public class LoginRecordMapperTest {

    @Autowired
    private LoginRecordMapper loginRecordMapper;

    @Test
    public void testinsertLoginRecord(){
        LoginRecord loginRecord = new LoginRecord();
        loginRecord.setUserId(1);
        loginRecord.setLoginTime(new Date(System.currentTimeMillis()));
        loginRecordMapper.insertLoginRecord(loginRecord);
    }

    @Test
    public void testfindRecordsById(){
        List<LoginRecord> records = loginRecordMapper.findRecordsById(1);
        for (LoginRecord record : records){
            System.out.println("record = " + record);
        }
    }

    @Test
    public void testinsertLogoutRecord(){
        LoginRecord loginRecord = new LoginRecord();
        loginRecord.setRecordId(1);
        loginRecord.setUserId(1);
        loginRecord.setLoginTime(new Date(System.currentTimeMillis()));
        loginRecord.setLogoutTime(new Date());
        loginRecord.setOnlineTime(3600L);
        loginRecordMapper.insertLogoutRecord(loginRecord);
    }

}