package com.atguigu.yygh.order.mapper;

import com.atguigu.yygh.model.order.OrderInfo;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * @Description: 订单 mapper
 * @Author: Hypocrite30
 * @Date: 2021/9/19 21:28
 */
@Mapper
public interface OrderMapper extends BaseMapper<OrderInfo> {
}
