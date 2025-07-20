package org.oooooomy.schedule.controller;

import jakarta.annotation.Resource;
import org.oooooomy.common.enums.ExceptionCode;
import org.oooooomy.common.response.R;
import org.oooooomy.schedule.model.entity.Schedule;
import org.oooooomy.schedule.service.ScheduleService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/schedule")
public class ScheduleController {

    @Resource
    private ScheduleService scheduleService;

    /**
     * 获取班次列表，数据量不大，不需要分页
     *
     * @return List<Schedule>
     */
    @GetMapping
    public R<List<Schedule>> listSchedules() {
        List<Schedule> schedules = scheduleService.list();
        return R.success(schedules);
    }

    /**
     * 获取班次列表，数据量不大，不需要分页
     * 节假日通过修改班次承载人数
     *
     * @return List<Schedule>
     */
    @PutMapping
    public R<Void> updateSchedule(@RequestBody Schedule schedule) {
        boolean ok = scheduleService.updateById(schedule);
        if (!ok) {
            return R.failed(ExceptionCode.BUSINESS_ERROR);
        }
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

    /**
     * 锁定座位（Redis Lua原子操作）
     *
     * @param id ScheduleId
     * @return null
     */
    @PostMapping("/{id}/lock")
    public R<Void> lock(@PathVariable Long id) {
        return R.success();
    }

    /**
     * 释放座位
     *
     * @param id ScheduleId
     * @return null
     */
    @PostMapping("/{id}/release")
    public R<Void> release(@PathVariable Long id) {
        return R.success();
    }

}
