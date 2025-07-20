package org.oooooomy.order.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.oooooomy.order.mapper.OrderMapper;
import org.oooooomy.order.entity.Order;
import org.oooooomy.order.service.OrderService;
import org.springframework.stereotype.Service;

@Service
public class OrderServiceImpl extends ServiceImpl<OrderMapper, Order> implements OrderService {

    @Override
    public Order createOrder() {
        return null;
    }

}
