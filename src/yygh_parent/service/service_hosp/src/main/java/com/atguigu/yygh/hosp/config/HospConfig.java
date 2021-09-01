package com.atguigu.yygh.hosp.config;

import com.baomidou.mybatisplus.extension.plugins.PaginationInterceptor;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Description: 医院设置配置类
 * @Author: Hypocrite30
 * @Date: 2021/9/1 15:09
 */
@Configuration
@MapperScan("com.atguigu.yygh.hosp.mapper")
public class HospConfig {
    /**
     * mp 分页插件
     */
    @Bean
    public PaginationInterceptor paginationInterceptor() {
        return new PaginationInterceptor();
    }
}
