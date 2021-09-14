package com.atguigu.yygh.msm.service;

/**
 * @Description: 短信服务 service
 * @Author: Hypocrite30
 * @Date: 2021/9/14 21:29
 */
public interface MsmService {
    //发送手机验证码
    boolean send(String phone, String code);
}
