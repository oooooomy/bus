package org.oooooomy.schedule.model.vo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalTime;

@Getter
@Setter
@NoArgsConstructor
public class ScheduleVO {

    /**
     * 班次ID
     */
    @TableId(type = IdType.ASSIGN_ID)
    private Long id;

    /**
     * 出发校区
     */
    private String departureCampus;

    /**
     * 到达校区
     */
    private String arrivalCampus;

    /**
     * 发车时间
     */
    private LocalTime departureTime;

    /**
     * 花费分钟数
     */
    private Integer spendMinutes;

    /**
     * 总座位数
     */
    private Integer totalSeats;

    /**
     * 可用座位数
     */
    private Integer availableSeats;

    /**
     * 票价
     */
    private BigDecimal price;

}
