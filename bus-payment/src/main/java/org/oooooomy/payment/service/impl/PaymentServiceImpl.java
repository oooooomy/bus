package org.oooooomy.payment.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.oooooomy.payment.mapper.PaymentMapper;
import org.oooooomy.payment.model.entity.Payment;
import org.oooooomy.payment.service.PaymentService;
import org.springframework.stereotype.Service;

@Service
public class PaymentServiceImpl extends ServiceImpl<PaymentMapper, Payment> implements PaymentService {
}
