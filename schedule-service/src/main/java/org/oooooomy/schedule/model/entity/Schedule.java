package org.oooooomy.schedule.model.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalTime;
import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@TableName("t_schedule")
public class Schedule {

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

    /**
     * 状态(1-正常 0-取消)
     */
    private Integer status;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 更新时间
     */
    private Date updateTime;

}
