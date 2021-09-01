package com.atguigu.yygh.cmn.config;

import com.baomidou.mybatisplus.extension.plugins.PaginationInterceptor;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Description: 数据字典配置类
 * @Author: Hypocrite30
 * @Date: 2021/9/1 15:09
 */
@Configuration
@MapperScan("com.atguigu.yygh.cmn.mapper")
public class CmnConfig {
    /**
     * mp 分页插件
     */
    @Bean
    public PaginationInterceptor paginationInterceptor() {
        return new PaginationInterceptor();
    }
}
