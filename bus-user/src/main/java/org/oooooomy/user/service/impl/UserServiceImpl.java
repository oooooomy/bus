package org.oooooomy.user.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.oooooomy.user.mapper.UserMapper;
import org.oooooomy.user.model.entity.User;
import org.oooooomy.user.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {
}
