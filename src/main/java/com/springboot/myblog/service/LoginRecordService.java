package com.springboot.myblog.service;

import com.springboot.myblog.pojo.LoginRecord;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;


import java.util.List;

public interface LoginRecordService {

    /* 添加一条登陆记录 */
    boolean insertLoginRecord(LoginRecord loginRecord);

    /* 添加一条登出记录 */
    boolean insertLogoutRecord(LoginRecord loginRecord);

    /* 删除一条记录 */
    boolean deleteOneRecord(Integer recordId);

    /* 批量删除记录 */
    /*boolean batchDeleteRecord(List<Integer> recordIds);*/

    /* 查询登陆记录 */
    Page<LoginRecord> findAll(Integer userId, Pageable pageable);

}
