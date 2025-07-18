package org.oooooomy.order.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.oooooomy.order.model.entity.Order;

@Mapper
public interface OrderMapper extends BaseMapper<Order> {
}
