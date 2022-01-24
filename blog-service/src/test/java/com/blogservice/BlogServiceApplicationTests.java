package com.blogservice;

import com.blogservice.web.impl.BlogDirectoryServiceImpl;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
class BlogServiceApplicationTests {

	@Autowired
	private BlogDirectoryServiceImpl blogDirectoryService;

	@Test
	void contextLoads() {
		System.out.println(blogDirectoryService.selectAllBlogDirectory());
	}

}
