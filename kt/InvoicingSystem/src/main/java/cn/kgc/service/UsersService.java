package cn.kgc.service;

import cn.kgc.entity.Users;

public interface UsersService {
    //登录
    Users loginByUserNameAndPassword(String userName,String password);
}
