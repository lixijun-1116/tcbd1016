package cn.kgc.dao;

import cn.kgc.entity.Login;

import java.util.List;

public interface LoginMapper {

    Login queryByMobileAndAccountAndPassword(Login login);

    List<Login> select();
}
