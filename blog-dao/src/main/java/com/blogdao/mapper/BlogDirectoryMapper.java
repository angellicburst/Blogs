package com.blogdao.mapper;

import com.blogpojo.web.entity.DirectoryBean;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface BlogDirectoryMapper {

    @Select("select ID, PARENT_ID, DIR_NAME, CREATE_TIME, UPDATE_TIME from blogs.BLOG_DIRECTORY")
    DirectoryBean selectAllBlogDirectory ();
}
