package org.oooooomy.schedule.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.oooooomy.schedule.mapper.ScheduleMapper;
import org.oooooomy.schedule.model.entity.Schedule;
import org.oooooomy.schedule.service.ScheduleService;
import org.springframework.stereotype.Service;

@Service
public class ScheduleServiceImpl extends ServiceImpl<ScheduleMapper, Schedule> implements ScheduleService {
}
