package com.blogdao;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BlogDaoApplication {

	public static void main(String[] args) {
		SpringApplication.run(BlogDaoApplication.class, args);
	}

}
