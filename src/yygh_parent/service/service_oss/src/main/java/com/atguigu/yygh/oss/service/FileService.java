package com.atguigu.yygh.oss.service;

import org.springframework.web.multipart.MultipartFile;

/**
 * @Description: oss 文件上传 service
 * @Author: Hypocrite30
 * @Date: 2021/9/16 22:14
 */
public interface FileService {
    // oss 文件上传，返回路径
    String upload(MultipartFile file);
}
