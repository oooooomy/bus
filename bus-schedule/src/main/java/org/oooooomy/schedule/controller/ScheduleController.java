package org.oooooomy.schedule.controller;

import jakarta.annotation.Resource;
import org.oooooomy.common.response.R;
import org.oooooomy.schedule.model.entity.Schedule;
import org.oooooomy.schedule.service.ScheduleService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/schedule")
public class ScheduleController {

    @Resource
    private ScheduleService scheduleService;
//    班次查询接口
//    GET  /schedules                     // 分页查询班次列表
//    GET  /schedules/{id}                // 获取班次详情
//    GET  /schedules/availability/{id}   // 实时查询余票（Redis缓存）

//    库存操作接口
//    POST /schedules/{id}/lock           // 锁定座位（Redis Lua原子操作）
//    POST /schedules/{id}/release        // 释放座位


    /**
     * 分页获取班次
     * 管理员端查询接口
     *
     * @return 班次列表
     */
    @GetMapping
    public R<List<Schedule>> getByPage() {
        return R.success(null);
    }

    /**
     * 根据日期查询班次列表，某一天的班次不会太大，不需要分页
     * 用户端查询接口
     *
     * @return 班次列表
     */
    @GetMapping("/stu/searchByDay")
    public R<List<Schedule>> searchByDay() {
        return R.success(null);
    }

    /**
     * 获取班次详情
     *
     * @param id ScheduleId
     * @return Schedule
     */
    @GetMapping("/{id}")
    public R<Schedule> getScheduleById(@PathVariable Long id) {
        return R.success(scheduleService.getById(id));
    }

}
