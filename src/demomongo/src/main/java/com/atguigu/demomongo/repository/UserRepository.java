package com.atguigu.demomongo.repository;

import com.atguigu.demomongo.entity.User;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * @Description: Spring Date对mongodb的实现，继承MongoRepository即可
 * @Author: Hypocrite30
 * @Date: 2021/9/5 11:57
 */
public interface UserRepository extends MongoRepository<User, String> {
}
