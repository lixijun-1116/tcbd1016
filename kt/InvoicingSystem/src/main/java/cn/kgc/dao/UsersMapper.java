package cn.kgc.dao;

import cn.kgc.entity.Users;
import org.apache.ibatis.annotations.Param;

public interface UsersMapper {
    //登录
    Users selectUsersByUserNameAndPassword(@Param("userName") String userName,
                                           @Param("password")String password);
}
