package cn.kgc.service.impl;

import cn.kgc.dao.UserDao;
import cn.kgc.entity.User;
import cn.kgc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service("userService")
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;
   /* public UserServiceImpl(UserDao userDao){
        this.userDao = userDao;
    }*/

    @Override
    public Integer save(User user) {

        return userDao.save(user);
    }
}
