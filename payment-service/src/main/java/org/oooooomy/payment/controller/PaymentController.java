package org.oooooomy.payment.controller;

import org.oooooomy.common.response.R;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/payment")
public class PaymentController {

    @PostMapping("/request")
    public R<Void> requestPay() {
        return R.success();
    }

    @PostMapping("/notify")
    public R<Void> payNotify() {
        return R.success();
    }

}
