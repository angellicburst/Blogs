package com.blogpojo.web.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class DirectoryBean {
    private int id;
    private int parentId;
    private int dirName;
    private int createTime;
    private int updateTime;
}
