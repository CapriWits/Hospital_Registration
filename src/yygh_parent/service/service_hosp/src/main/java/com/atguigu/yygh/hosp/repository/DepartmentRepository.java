package com.atguigu.yygh.hosp.repository;

import com.atguigu.yygh.model.hosp.Department;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

/**
 * @Description: 科室信息 repository
 * @Author: Hypocrite30
 * @Date: 2021/9/9 12:16
 */
@Repository
public interface DepartmentRepository extends MongoRepository<Department, String> {
    /**
     * 根据 hoscode 和 depcode 查找封装 Department 对象
     * 由 Spring Date 实现
     */
    Department getDepartmentByHoscodeAndDepcode(String hoscode, String depcode);
}
