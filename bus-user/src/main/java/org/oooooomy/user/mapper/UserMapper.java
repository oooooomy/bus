package org.oooooomy.user.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.oooooomy.user.model.entity.User;

@Mapper
public interface UserMapper extends BaseMapper<User> {
}
