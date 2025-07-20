package org.oooooomy.user.controller;

import org.oooooomy.common.response.R;
import org.oooooomy.user.model.entity.User;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/auth")
public class AuthController {

//    POST /auth/login       // 用户登录（返回JWT）
//    GET  /auth/userinfo    // 获取当前用户信息
//    POST /auth/logout      // 注销登录

    @PostMapping("/login")
    public R<String> login(@RequestBody User user) {
        return R.success("jwt token");
    }

    @GetMapping("/userinfo")
    public R<User> userinfo() {
        return R.success(null);
    }

    @PostMapping("/logout")
    public R<Void> logout(@RequestBody User user) {
        return R.success();
    }

}
