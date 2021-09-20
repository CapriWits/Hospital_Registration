package com.atguigu.yygh.order.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * @Description: 配置类
 * @Author: Hypocrite30
 * @Date: 2021/9/19 21:31
 */
@Configuration
@MapperScan("com.atguigu.yygh.order.mapper")
public class OrderConfig {
}
