package org.oooooomy.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import org.oooooomy.order.entity.Order;

public interface OrderService extends IService<Order> {

    Order createOrder();

}
