package org.oooooomy.common.enums;

import lombok.Getter;

@Getter
public enum ExceptionCode {

    // 系统错误
    SYSTEM_ERROR(500, "系统内部错误"),
    // 参数错误
    PARAM_ERROR(400, "参数错误"),
    // 未授权
    UNAUTHORIZED(401, "未授权"),
    // 禁止访问
    FORBIDDEN(403, "禁止访问"),
    // 数据不存在
    DATA_NOT_FOUND(404, "数据不存在"),
    // 业务异常
    BUSINESS_ERROR(600, "业务异常");

    private final Integer code;

    private final String message;

    ExceptionCode(Integer code, String message) {
        this.code = code;
        this.message = message;
    }

}
