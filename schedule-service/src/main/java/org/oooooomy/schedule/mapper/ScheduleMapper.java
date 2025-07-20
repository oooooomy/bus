package org.oooooomy.schedule.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.oooooomy.schedule.model.entity.Schedule;

@Mapper
public interface ScheduleMapper extends BaseMapper<Schedule> {
}
