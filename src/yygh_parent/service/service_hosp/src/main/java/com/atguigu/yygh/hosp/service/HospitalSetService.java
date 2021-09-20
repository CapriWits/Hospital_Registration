package com.atguigu.yygh.hosp.service;

import com.atguigu.yygh.model.hosp.HospitalSet;
import com.atguigu.yygh.vo.order.SignInfoVo;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * @Description: 医院设置 service
 * @Author: Hypocrite30
 * @Date: 2021/8/30 22:41
 */
public interface HospitalSetService extends IService<HospitalSet> {
    //查询签名
    String getSignKey(String hoscode);

    //根据医院编号获取医院签名信息
    SignInfoVo getSignInfoVo(String hoscode);
}
