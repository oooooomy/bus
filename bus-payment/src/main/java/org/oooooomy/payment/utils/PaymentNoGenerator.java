package org.oooooomy.payment.utils;

import org.apache.commons.codec.binary.Hex;

import java.security.SecureRandom;
import java.text.SimpleDateFormat;
import java.util.Date;

public final class PaymentNoGenerator {

    public static String generatePaymentNo() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmss");
        String timePart = sdf.format(new Date()).substring(0, 14);
        return timePart + "BUS" + generateSecureRandom();
    }

    private static String generateSecureRandom() {
        SecureRandom random = new SecureRandom();
        byte[] bytes = new byte[12];
        random.nextBytes(bytes);
        return Hex.encodeHexString(bytes).substring(0, 12);
    }

}
