package cn.kgc.dao;

import cn.kgc.entity.User;

public interface UserMapper {
    public User loginByUserNameAndPassword(User user);
}
