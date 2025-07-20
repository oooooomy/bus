package org.oooooomy.order.dto.request;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;

public class CreateOrderRequest {

    @NotNull(message = "用户ID不能为空")
    private Long userId;

    @Pattern(regexp = "\\d{10}", message = "学号格式不正确")
    private String studentId;

    @NotNull(message = "班次ID不能为空")
    private String scheduleId;

    // getters/setters 省略(使用Lombok @Data)
}
