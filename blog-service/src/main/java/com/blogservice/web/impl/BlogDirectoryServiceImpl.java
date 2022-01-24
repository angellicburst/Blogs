package com.blogservice.web.impl;

import com.blogdao.mapper.BlogDirectoryMapper;
import com.blogpojo.web.entity.DirectoryBean;
import com.blogservice.web.BlogDirectoryService;
import org.springframework.stereotype.Service;

@Service
public class BlogDirectoryServiceImpl implements BlogDirectoryService {

    private BlogDirectoryMapper blogDirectoryMapper;

    @Override
    public DirectoryBean selectAllBlogDirectory() {
        return blogDirectoryMapper.selectAllBlogDirectory();
    }
}
