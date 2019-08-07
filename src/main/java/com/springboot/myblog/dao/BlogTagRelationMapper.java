package com.springboot.myblog.dao;

import com.springboot.myblog.pojo.BlogTagRelation;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface BlogTagRelationMapper {

    int deleteByPrimaryKey(Integer relationId);

    int insert(BlogTagRelation record);

    int insertSelective(BlogTagRelation record);

    BlogTagRelation selectByPrimaryKey(Integer relationId);

    BlogTagRelation selectByBlogIdAndTagId(Integer blogId, Integer tagId);

    List<Long> selectDistinctTagIds(Integer[] tagIds);

    int updateByPrimaryKeySelective(BlogTagRelation record);

    int updateByPrimaryKey(BlogTagRelation record);

    int batchInsert(List<BlogTagRelation> blogTagRelationList);

    int deleteByBlogId(Integer blogId);

}
