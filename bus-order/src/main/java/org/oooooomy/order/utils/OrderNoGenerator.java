package org.oooooomy.order.utils;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

public final class OrderNoGenerator {

    public static String generatePaymentNo() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmss");
        String timePart = sdf.format(new Date());
        String randomPart = String.format("%04d", new Random().nextInt(10000));
        return timePart + randomPart;
    }

}
