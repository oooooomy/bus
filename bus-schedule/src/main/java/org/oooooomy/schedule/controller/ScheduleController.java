package org.oooooomy.schedule.controller;

import jakarta.annotation.Resource;
import org.oooooomy.schedule.service.ScheduleService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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

}
