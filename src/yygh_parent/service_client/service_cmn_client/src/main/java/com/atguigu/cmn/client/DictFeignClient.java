package com.atguigu.cmn.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * 将对应客户端的 Controller 方法直接复制过来
 * 补充好全路径
 * PathVariable加上入参变量名，不然要出错
 * @Description: 数字字典远程调用 API 接口
 * @Author: Hypocrite30
 * @Date: 2021/9/11 11:22
 */
@FeignClient("service-cmn") // Feign客户端，即配置文件的服务名
@Repository // 加上只是为了注入时不报错
public interface DictFeignClient {

    //根据dictcode和value查询
    @GetMapping("/admin/cmn/dict/getName/{dictCode}/{value}")
    String getName(@PathVariable("dictCode") String dictCode, @PathVariable("value") String value);

    //根据value查询
    @GetMapping("/admin/cmn/dict/getName/{value}")
    String getName(@PathVariable("value") String value);


}
