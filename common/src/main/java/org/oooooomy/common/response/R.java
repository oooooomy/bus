package org.oooooomy.common.response;

import org.oooooomy.common.enums.ExceptionCode;

public record R<T>(int code, String msg, T data) {

    public static final int SUCCESS_CODE = 0;

    public static final String SUCCESS_MSG = "success";

    public static <T> R<T> success() {
        return new R<>(SUCCESS_CODE, SUCCESS_MSG, null);
    }

    public static <T> R<T> success(T data) {
        return new R<>(SUCCESS_CODE, SUCCESS_MSG, data);
    }

    public static <T> R<T> failed(ExceptionCode exceptionCode) {
        return new R<>(exceptionCode.getCode(), exceptionCode.getMessage(), null);
    }

}
