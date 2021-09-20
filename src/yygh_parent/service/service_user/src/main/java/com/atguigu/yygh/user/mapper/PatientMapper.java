package com.atguigu.yygh.user.mapper;

import com.atguigu.yygh.model.user.Patient;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * @Description: 就诊人管理 mapper
 * @Author: Hypocrite30
 * @Date: 2021/9/17 21:10
 */
@Mapper
public interface PatientMapper extends BaseMapper<Patient> {
}
