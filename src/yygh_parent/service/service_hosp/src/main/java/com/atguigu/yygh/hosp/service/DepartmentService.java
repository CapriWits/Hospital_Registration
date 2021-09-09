package com.atguigu.yygh.hosp.service;

import com.atguigu.yygh.model.hosp.Department;
import com.atguigu.yygh.vo.hosp.DepartmentQueryVo;
import org.springframework.data.domain.Page;

import java.util.Map;

/**
 * @Description: 科室信息 Service
 * @Author: Hypocrite30
 * @Date: 2021/9/9 12:19
 */
public interface DepartmentService {
    // 上传科室信息
    void save(Map<String, Object> paramMap);

    // 查询科室接口
    Page<Department> findPageDepartment(int page, int limit, DepartmentQueryVo departmentQueryVo);

    // 删除科室
    void remove(String hoscode, String depcode);
}
