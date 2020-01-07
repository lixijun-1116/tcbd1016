package cn.kgc.service.impl;

import cn.kgc.dao.LoginMapper;
import cn.kgc.entity.Login;
import cn.kgc.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("loginService")
public class LoginServiceImpl implements LoginService {
    @Autowired
    private LoginMapper loginMapper;
    @Override
    public Login login(Login login) {
        return loginMapper.queryByMobileAndAccountAndPassword(login);
    }

    @Override
    public List<Login> select() {
        return loginMapper.select();
    }
}
