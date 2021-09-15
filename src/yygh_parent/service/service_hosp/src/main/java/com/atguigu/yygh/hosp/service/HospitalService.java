package com.atguigu.yygh.hosp.service;

import com.atguigu.yygh.model.hosp.Hospital;
import com.atguigu.yygh.vo.hosp.HospitalQueryVo;
import org.springframework.data.domain.Page;

import java.util.List;
import java.util.Map;

/**
 * @Description: 医院管理 service
 * @Author: Hypocrite30
 * @Date: 2021/9/7 17:05
 */
public interface HospitalService {
    // 上传医院接口
    void save(Map<String, Object> paramMap);

    // 实现根据医院编号查询
    Hospital getByHoscode(String hoscode);

    // 条件查询分页 医院列表
    Page<Hospital> selectHospPage(Integer page, Integer limit, HospitalQueryVo hospitalQueryVo);

    // 更新医院上线状态
    void updateStatus(String id, Integer status);

    //医院详情信息
    Map<String, Object> getHospById(String id);

    //根据hoscode获取医院名称
    String getHospName(String hoscode);

    //根据医院名称做模糊查询
    List<Hospital> findByHosname(String hosname);

    //根据医院编号获取医院预约挂号详情
    Map<String, Object> item(String hoscode);
}
