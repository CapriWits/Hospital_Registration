package com.atguigu.easyexcel;

import com.alibaba.excel.annotation.ExcelProperty;
import lombok.Data;

/**
 * @Description: easyexcel测试
 * @Author: Hypocrite30
 * @Date: 2021/9/2 11:35
 */
@Data
public class UserData {

    @ExcelProperty(value = "用户编号", index = 0)
    private int uid;

    @ExcelProperty(value = "用户名称", index = 1)
    private String username;

}
