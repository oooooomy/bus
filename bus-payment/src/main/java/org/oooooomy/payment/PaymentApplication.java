package org.oooooomy.payment;

import org.oooooomy.payment.utils.PaymentNoGenerator;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class PaymentApplication {

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println(PaymentNoGenerator.generatePaymentNo());;
        }
        SpringApplication.run(PaymentApplication.class, args);
    }

}
