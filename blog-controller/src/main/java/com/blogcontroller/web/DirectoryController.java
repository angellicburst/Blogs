package com.blogcontroller.web;

import com.blogpojo.web.entity.DirectoryBean;
import com.blogservice.web.BlogDirectoryService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class DirectoryController {
    @Resource
    private BlogDirectoryService blogDirectoryService;

    @RequestMapping(value = "/getAllDirectory", method = RequestMethod.POST)
    private DirectoryBean getAllDirectory() {
        return blogDirectoryService.selectAllBlogDirectory();
    }
}
