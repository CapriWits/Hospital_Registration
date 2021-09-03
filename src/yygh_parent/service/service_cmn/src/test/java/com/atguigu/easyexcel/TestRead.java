package com.atguigu.easyexcel;

import com.alibaba.excel.EasyExcel;

/**
 * @Description: 读操作测试
 * @Author: Hypocrite30
 * @Date: 2021/9/2 11:48
 */
public class TestRead {

    public static void main(String[] args) {
        // 读取文件路径
        String fileName = "C:\\Users\\10270\\Desktop\\excel\\01.xlsx";
        //调用方法实现读取操作
        EasyExcel.read(fileName, UserData.class, new ExcelListener()).sheet().doRead();
    }
}
