package com.atguigu.yygh.msm.utils;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * 实现 InitializingBean 接口，用 @Value 将配置信息类传入成员变量
 * 再赋值给常量，供外面使用。
 * InitializingBean 接口保证在 Bean 初始化完成后，执行定制化操作
 * @Description: 导入常量 工具类
 * @Author: Hypocrite30
 * @Date: 2021/9/14 21:18
 */
@Component
public class ConstantPropertiesUtils implements InitializingBean {
    // 阿里云sms配置
    /*
    @Value("${aliyun.sms.regionId}")
    private String regionId;

    @Value("${aliyun.sms.accessKeyId}")
    private String accessKeyId;

    @Value("${aliyun.sms.secret}")
    private String secret;

    public static String REGION_Id;
    public static String ACCESS_KEY_ID;
    public static String SECRECT;

    @Override
    public void afterPropertiesSet() throws Exception {
        REGION_Id = regionId;
        ACCESS_KEY_ID = accessKeyId;
        SECRECT = secret;
    }
    */
    // 容联云配置
    @Value("${cloopen.sms.accountSId}")
    private String accountSId;

    @Value("${cloopen.sms.accountToken}")
    private String accountToken;

    @Value("${cloopen.sms.appId}")
    private String appId;

    public static String ACCOUNT_SID;
    public static String ACCOUNT_TOKEN;
    public static String APP_ID;

    @Override
    public void afterPropertiesSet() throws Exception {
        ACCOUNT_SID = accountSId;
        ACCOUNT_TOKEN = accountToken;
        APP_ID = appId;
    }
}
