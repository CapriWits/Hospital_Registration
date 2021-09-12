package com.atguigu.yygh.hosp.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * 该配置类配合 @CrossOrigin 一起使用，然后 Nginx 反向代理
 * 如果用网关解决跨域，则不需要该配置类 和 @CrossOrigin 注解
 * @Description: 解决跨域问题 配置类
 * @Author: Hypocrite30
 * @Date: 2021/9/11 22:18
 */
// @Configuration
public class CrosConfig implements WebMvcConfigurer {
    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")
                .allowedOrigins("*")
                .allowedMethods("POST", "GET", "PUT", "OPTIONS", "DELETE")
                .allowCredentials(true)
                .allowedHeaders("*")
                .maxAge(3600);
    }
}
