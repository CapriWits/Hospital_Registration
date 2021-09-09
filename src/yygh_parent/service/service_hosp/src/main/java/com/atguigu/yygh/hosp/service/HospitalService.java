package com.atguigu.yygh.hosp.service;

import com.atguigu.yygh.model.hosp.Hospital;

import java.util.Map;

/**
 * @Description: 医院管理 repository
 * @Author: Hypocrite30
 * @Date: 2021/9/7 17:05
 */
public interface HospitalService {
    // 上传医院接口
    void save(Map<String, Object> paramMap);

    // 实现根据医院编号查询
    Hospital getByHoscode(String hoscode);
}
