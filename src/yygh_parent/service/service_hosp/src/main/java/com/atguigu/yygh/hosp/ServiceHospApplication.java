package com.atguigu.yygh.hosp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

/**
 * @Description: 医院管理平台启动类
 * @Author: Hypocrite30
 * @Date: 2021/8/30 22:06
 */
@SpringBootApplication
@ComponentScan(basePackages = "com.atguigu") //统一扫描路径
@EnableDiscoveryClient // 开启 Nacos 注册
//开启Feign远程调用，去找FeignClient注解的服务，同时注明模块位置，因为cmn_client放在另一个模块下
@EnableFeignClients(basePackages = "com.atguigu") // Feign调用入口
public class ServiceHospApplication {
    public static void main(String[] args) {
        SpringApplication.run(ServiceHospApplication.class, args);
    }
}
