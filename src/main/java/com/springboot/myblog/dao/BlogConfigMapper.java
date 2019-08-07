package com.springboot.myblog.dao;

import com.springboot.myblog.pojo.BlogConfig;

import java.util.List;

public interface BlogConfigMapper {

    List<BlogConfig> selectAll();

    BlogConfig selectByPrimaryKey(String configName);

    int updateByPrimaryKeySelective(BlogConfig record);
}
