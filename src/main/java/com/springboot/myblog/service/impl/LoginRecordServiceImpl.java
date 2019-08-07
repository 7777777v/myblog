package com.springboot.myblog.service.impl;

import com.springboot.myblog.dao.LoginRecordMapper;
import com.springboot.myblog.pojo.LoginRecord;
import com.springboot.myblog.service.LoginRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;


/**
 * @ClassName LoginRecordServiceImpl
 * @Description login record service 实现
 * @Author 2985062714@qq.com
 * @Date 2019/8/7 17:30
 * @Version 1.0
 */
@Service
public class LoginRecordServiceImpl implements LoginRecordService {

    @Autowired
    private LoginRecordMapper recordMapper;

    /* 插入登陆记录 */
    @Override
    public boolean insertLoginRecord(LoginRecord loginRecord) {
        if (loginRecord == null)
            return false;
        return recordMapper.insertLoginRecord(loginRecord) > 0;
    }

    /* 插入登出记录 */
    @Override
    public boolean insertLogoutRecord(LoginRecord loginRecord) {
        if (loginRecord == null)
            return false;
        return recordMapper.insertLogoutRecord(loginRecord) > 0;
    }

    /* 删除一条记录 */
    @Override
    public boolean deleteOneRecord(Integer recordId) {
        if (recordId == null)
            return false;
        return recordMapper.deleteOnyById(recordId) > 0;
    }

    /* 批量删除记录 */
    /*@Override
    public boolean batchDeleteRecord(List<Integer> recordIds) {
        if (recordIds == null || recordIds.size() == 0)
            return false;
        return recordMapper.batchDeleteById(recordIds) > 0;
    }*/

    /* 分页查询所有记录 */
    @Override
    public Page<LoginRecord> findAll(Integer userId, Pageable pageable) {
        if (userId == null)
            return null;
        return null;
    }
}
