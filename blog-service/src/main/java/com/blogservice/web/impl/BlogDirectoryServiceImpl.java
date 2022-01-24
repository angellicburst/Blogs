package com.blogservice.web.impl;

import com.blogdao.mapper.BlogDirectoryMapper;
import com.blogpojo.web.entity.DirectoryBean;
import com.blogservice.web.BlogDirectoryService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class BlogDirectoryServiceImpl implements BlogDirectoryService {

    @Resource
    private BlogDirectoryMapper blogDirectoryMapper;

    @Override
    public DirectoryBean selectAllBlogDirectory() {
        return blogDirectoryMapper.selectAllBlogDirectory();
    }
}
