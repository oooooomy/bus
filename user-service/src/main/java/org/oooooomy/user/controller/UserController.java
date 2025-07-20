package org.oooooomy.user.controller;

import jakarta.annotation.Resource;
import org.oooooomy.common.enums.ExceptionCode;
import org.oooooomy.common.response.R;
import org.oooooomy.user.model.entity.User;
import org.oooooomy.user.service.UserService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/user")
public class UserController {

    @Resource
    private UserService userService;

    @PostMapping
    public R<Void> addUser(@RequestBody User user) {
        userService.save(user);
        return R.success();
    }

    @GetMapping("/{id}")
    public R<User> getUserById(@PathVariable Long id) {
        User user = userService.getById(id);
        return R.success(user);
    }

    @PutMapping
    public R<User> updateUserById(@RequestBody User user) {
        boolean ok = userService.updateById(user);
        if (!ok) {
            return R.failed(ExceptionCode.BUSINESS_ERROR);
        }
        return R.success(user);
    }

}
