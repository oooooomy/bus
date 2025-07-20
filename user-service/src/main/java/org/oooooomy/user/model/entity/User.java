package org.oooooomy.user.model.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@TableName("t_user")
public class User {

    @TableId(type = IdType.ASSIGN_UUID)
    private Long id;

    private String studentId;

    private String name;

    private String phone;

    private String password;

    private String email;

    private boolean status;

    private Date createTime;

    private Date updateTime;

}
