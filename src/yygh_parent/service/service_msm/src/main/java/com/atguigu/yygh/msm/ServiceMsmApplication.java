package com.atguigu.yygh.msm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;

/**
 * @Description: 短信服务 启动类
 * @Author: Hypocrite30
 * @Date: 2021/9/14 21:12
 */
//取消数据源自动配置，因为短信服务又阿里云接口实现，不需要数据库
@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
@EnableDiscoveryClient // Nacos
// 为了让swagger找到，swagger配置类common里，不是一个模块
@ComponentScan(basePackages = {"com.atguigu"})
public class ServiceMsmApplication {
    public static void main(String[] args) {
        SpringApplication.run(ServiceMsmApplication.class, args);
    }
}
