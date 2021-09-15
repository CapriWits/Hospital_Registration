package com.atguigu.yygh.user.utils;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * 实现 InitializingBean 接口，用 @Value 将配置信息类传入成员变量
 * 再赋值给常量，供外面使用。
 * InitializingBean 接口保证在 Bean 初始化完成后，执行定制化操作
 * @Description: 导入常量 工具类
 * @Author: Hypocrite30
 * @Date: 2021/9/15 22:40
 */
@Component
public class ConstantWxPropertiesUtils implements InitializingBean {

    @Value("${wx.open.app_id}")
    private String appId;

    @Value("${wx.open.app_secret}")
    private String appSecret;

    @Value("${wx.open.redirect_url}")
    private String redirectUrl;

    @Value("${yygh.baseUrl}")
    private String yyghBaseUrl;


    public static String WX_OPEN_APP_ID;
    public static String WX_OPEN_APP_SECRET;
    public static String WX_OPEN_REDIRECT_URL;
    public static String YYGH_BASE_URL;


    @Override
    public void afterPropertiesSet() throws Exception {
        WX_OPEN_APP_ID = appId;
        WX_OPEN_APP_SECRET = appSecret;
        WX_OPEN_REDIRECT_URL = redirectUrl;
        YYGH_BASE_URL = yyghBaseUrl;
    }
}

