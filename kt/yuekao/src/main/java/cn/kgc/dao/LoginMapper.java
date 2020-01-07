package cn.kgc.dao;

import cn.kgc.entity.Login;
import org.apache.ibatis.annotations.Param;

public interface LoginMapper {
    //根据账号或手机号和密码登录
    Login selectByAccountOrMobileAndPassword(Login login);

    //根据账号或手机号和密码登录
    Login selectByAccountOrMobileAndPasswordRbac(Login login);



}
