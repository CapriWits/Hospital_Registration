package com.atguigu.yygh.user.client;

import com.atguigu.yygh.model.user.Patient;
import io.swagger.annotations.ApiParam;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * 将对应客户端的 Controller 方法直接复制过来
 * 补充好全路径
 * PathVariable加上入参变量名，不然要出错
 * @Description: 就诊人服务远程调用 API 接口
 * @Author: Hypocrite30
 * @Date: 2021/9/19 21:47
 */
@Repository
@FeignClient("service-user")
public interface PatientFeignClient {

    // 根据就诊人id获取就诊人信息(带上证件、地址等)
    @GetMapping("/api/user/patient/inner/get/{id}")
    public Patient getPatientOrder(@PathVariable("id") Long id);
}
