package com.atguigu.yygh.hosp.repository;

import com.atguigu.yygh.model.hosp.Hospital;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * MongoDB 的数据库操作接口，由Spring Date实现
 * @Description: 医院管理 repository
 * @Author: Hypocrite30
 * @Date: 2021/9/7 17:02
 */
@Repository
public interface HospitalRepository extends MongoRepository<Hospital, String> {
    // 判断是否存在数据
    // 只要符合Spring Date命名规范，就可以自动实现类，不需要手动实现
    Hospital getHospitalByHoscode(String hoscode);

    //根据医院名称做模糊查询
    List<Hospital> findHospitalByHosnameLike(String hosname);
}
