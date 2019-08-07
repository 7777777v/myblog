package com.springboot.myblog.service;

import com.springboot.myblog.pojo.Blog;
import com.springboot.myblog.util.PageQueryUtil;
import com.springboot.myblog.util.PageResult;
import com.springboot.myblog.vo.BlogDetailVo;
import com.springboot.myblog.vo.SimpleBlogListVo;

import java.util.List;

public interface BlogService {

    String saveBlog(Blog blog);

    PageResult getBlogsPage(PageQueryUtil pageUtil);

    Boolean deleteBatch(Integer[] ids);

    int getTotalBlogs();

    /**
     * 根据id获取详情
     *
     * @param blogId
     * @return
     */
    Blog getBlogById(Integer blogId);

    /**
     * 后台修改
     *
     * @param blog
     * @return
     */
    String updateBlog(Blog blog);

    /**
     * 获取首页文章列表
     *
     * @param page
     * @return
     */
    PageResult getBlogsForIndexPage(int page);

    /**
     * 首页侧边栏数据列表
     * 0-点击最多 1-最新发布
     *
     * @param type
     * @return
     */
    List<SimpleBlogListVo> getBlogListForIndexPage(int type);
    /**
     * 文章详情
     *
     * @param blogId
     * @return
     */
    BlogDetailVo getBlogDetail(Integer blogId);

    /**
     * 根据标签获取文章列表
     *
     * @param tagName
     * @param page
     * @return
     */
    PageResult getBlogsPageByTag(String tagName, int page);

    /**
     * 根据分类获取文章列表
     *
     * @param categoryId
     * @param page
     * @return
     */
    PageResult getBlogsPageByCategory(String categoryId, int page);

    /**
     * 根据搜索获取文章列表
     *
     * @param keyword
     * @param page
     * @return
     */
    PageResult getBlogsPageBySearch(String keyword, int page);

    BlogDetailVo getBlogDetailBySubUrl(String subUrl);

}
