package com.atguigu.yygh.order.service;

import com.atguigu.yygh.model.order.OrderInfo;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * @Description: 订单 service
 * @Author: Hypocrite30
 * @Date: 2021/9/19 21:27
 */
public interface OrderService extends IService<OrderInfo> {
    // 根据排班id和就诊人id创建挂号订单
    Long saveOrder(String scheduleId, Long patientId);
}
