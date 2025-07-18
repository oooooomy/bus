package org.oooooomy.common.response;

import lombok.Getter;
import org.oooooomy.common.enums.ExceptionCode;

@Getter
public final class R<T> {

    public static final int SUCCESS_CODE = 0;

    public static final String SUCCESS_MSG = "success";

    private final int code;

    private final String msg;

    private final T data;

    public R(int code, String msg, T data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

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
