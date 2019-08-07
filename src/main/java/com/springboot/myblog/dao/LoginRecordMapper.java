package com.springboot.myblog.dao;


import com.springboot.myblog.pojo.LoginRecord;
import com.springboot.myblog.util.PageQueryUtil;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface LoginRecordMapper {

    /* 新增用户登陆记录 */
    int insertLoginRecord(LoginRecord loginRecord);

    /* 查询用户登陆记录 */
    List<LoginRecord> findRecordsById(Integer userId);

    /* 新增用户登出记录 */
    int insertLogoutRecord(LoginRecord loginRecord);

    /* 删除一条登陆记录 */
    int deleteOnyById(Integer recordId);

    /* 批量删除登陆记录 */
    int batchDeleteById(PageQueryUtil queryUtil);
}
