package com.atguigu.yygh.hosp.controller;

import com.atguigu.yygh.common.result.Result;
import com.atguigu.yygh.hosp.service.ScheduleService;
import com.atguigu.yygh.model.hosp.Schedule;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

/**
 * @Description: 排班信息 Controller
 * @Author: Hypocrite30
 * @Date: 2021/9/11 22:27
 */
@RestController
@RequestMapping("/admin/hosp/schedule")
// @CrossOrigin // 解决跨域，配合配置类
public class ScheduleController {

    @Autowired
    private ScheduleService scheduleService;

    //根据医院编号 和 科室编号 ，查询排班规则数据
    @ApiOperation(value = "查询排班规则数据")
    @GetMapping("getScheduleRule/{page}/{limit}/{hoscode}/{depcode}")
    public Result getScheduleRule(@PathVariable long page,
                                  @PathVariable long limit,
                                  @PathVariable String hoscode,
                                  @PathVariable String depcode) {
        Map<String, Object> map = scheduleService.getRuleSchedule(page, limit, hoscode, depcode);
        return Result.ok(map);
    }

    //根据医院编号 、科室编号和工作日期，查询排班详细信息
    @ApiOperation(value = "查询排班详细信息")
    @GetMapping("getScheduleDetail/{hoscode}/{depcode}/{workDate}")
    public Result getScheduleDetail(@PathVariable String hoscode,
                                    @PathVariable String depcode,
                                    @PathVariable String workDate) {
        List<Schedule> list = scheduleService.getDetailSchedule(hoscode, depcode, workDate);
        return Result.ok(list);
    }
}
