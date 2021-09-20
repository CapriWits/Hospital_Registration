package com.atguigu.yygh.hosp.client;

import com.atguigu.yygh.vo.hosp.ScheduleOrderVo;
import com.atguigu.yygh.vo.order.SignInfoVo;
import io.swagger.annotations.ApiParam;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * 将对应客户端的 Controller 方法直接复制过来
 * 补充好全路径
 * PathVariable加上入参变量名，不然要出错
 * @Description: 医院服务服务远程调用 API 接口
 * @Author: Hypocrite30
 * @Date: 2021/9/19 22:25
 */
@Repository
@FeignClient("service-hosp")
public interface HospitalFeignClient {

    //根据排班id获取预约下单数据
    @GetMapping("/api/hosp/hospital/inner/getScheduleOrderVo/{scheduleId}")
    public ScheduleOrderVo getScheduleOrderVo(@PathVariable("scheduleId") String scheduleId);

    //根据医院编号获取医院签名信息
    @GetMapping("/api/hosp/hospital/inner/getSignInfoVo/{hoscode}")
    public SignInfoVo getSignInfoVo(@PathVariable("hoscode") String hoscode);
}
