package com.atguigu.demomongo.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * @Description: mongodb User实体类
 * @Author: Hypocrite30
 * @Date: 2021/9/5 11:16
 */
@Data
@Document("User")
public class User {

    @Id
    private String id;
    private String name;
    private Integer age;
    private String email;
    private String createDate;
}
