package com.atguigu.yygh.hosp.controller.api;

import com.atguigu.yygh.common.result.Result;
import com.atguigu.yygh.hosp.service.HospitalService;
import com.atguigu.yygh.model.hosp.Hospital;
import com.atguigu.yygh.vo.hosp.HospitalQueryVo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Description: 医院用户平台 前台接口
 * @Author: Hypocrite30
 * @Date: 2021/9/12 19:22
 */
@Api(tags = "医院管理接口")
@RestController
@RequestMapping("/api/hosp/hospital")
public class HospApiController {

    @Autowired
    private HospitalService hospitalService;

    @ApiOperation(value = "查询医院列表")
    @GetMapping("findHospList/{page}/{limit}")
    public Result findHospList(@PathVariable Integer page,
                               @PathVariable Integer limit,
                               HospitalQueryVo hospitalQueryVo) {
        Page<Hospital> hospitals = hospitalService.selectHospPage(page, limit, hospitalQueryVo);
        return Result.ok(hospitals);
    }

    //根据医院名称做模糊查询
    @ApiOperation(value = "根据医院名称查询")
    @GetMapping("findByHosName/{hosname}")
    public Result findByHosName(@PathVariable String hosname) {
        List<Hospital> list = hospitalService.findByHosname(hosname);
        return Result.ok(list);
    }

    // @ApiOperation(value = "获取分页列表")
    // @GetMapping("{page}/{limit}")
    // public Result index(
    //         @PathVariable Integer page,
    //         @PathVariable Integer limit,
    //         HospitalQueryVo hospitalQueryVo) {
    //     //显示上线的医院
    //     //hospitalQueryVo.setStatus(1);
    //     Page<Hospital> pageModel = hospitalService.selectHospPage(page, limit, hospitalQueryVo);
    //     return Result.ok(pageModel);
    // }
}
