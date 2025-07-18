package org.oooooomy.common.execption;

import lombok.Getter;
import org.oooooomy.common.enums.ExceptionCode;

public class BusinessException extends RuntimeException {

    @Getter
    private final Integer code;
    private final String message;

    public BusinessException(ExceptionCode exceptionCode) {
        super(exceptionCode.getMessage());
        this.code = exceptionCode.getCode();
        this.message = exceptionCode.getMessage();
    }

    @Override
    public String getMessage() {
        return message;
    }

}
