package com.blogpojo.web.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class DirectoryBean implements Serializable {
    private int id;
    private int parentId;
    private String dirName;
    private Date createTime;
    private Date updateTime;
}
