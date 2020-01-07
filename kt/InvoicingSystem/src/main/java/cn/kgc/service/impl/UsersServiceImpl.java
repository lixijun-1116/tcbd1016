package cn.kgc.service.impl;

import cn.kgc.dao.UsersMapper;
import cn.kgc.entity.Users;
import cn.kgc.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsersServiceImpl implements UsersService {
    @Autowired
    private UsersMapper usersMapper;
    @Override
    public Users loginByUserNameAndPassword(String userName,String password) {
        return usersMapper.selectUsersByUserNameAndPassword(userName,password);
    }
}
