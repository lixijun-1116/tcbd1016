package cn.kgc.service;

import cn.kgc.entity.Login;

import java.util.List;

public interface LoginService {
    public Login login(Login login);
    List<Login> select();
}
