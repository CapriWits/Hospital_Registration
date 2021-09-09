package com.atguigu.yygh.hosp.repository;

import com.atguigu.yygh.model.hosp.Schedule;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

/**
 * @Description: 排班 repository
 * @Author: Hypocrite30
 * @Date: 2021/9/9 16:58
 */
@Repository
public interface ScheduleRepository extends MongoRepository<ScheduleRepository, String> {
    /**
     * 根据 hoscode & hosScheduleId 查询
     * Spring Date 实现
     */
    Schedule getScheduleByHoscodeAndHosScheduleId(String hoscode, String hosScheduleId);
}
