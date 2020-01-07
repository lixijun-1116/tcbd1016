package cn.kgc.service.impl;

import cn.kgc.dao.UserMapper;
import cn.kgc.entity.User;
import cn.kgc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by Administrator on 2019/12/30/030.
 */
@Service
public class UserServiceImpl implements UserService {
    @Resource
    private UserMapper userMapper;
    @Override
    public List<User> queryAll() {
        return userMapper.queryAll();
    }

    @Override
    public User queryById(Integer id) {
        return userMapper.queryById(id);
    }

    @Override
    public Integer save(User user) {
        return userMapper.save(user);
    }

    @Override
    public Integer update(User user) {
        return userMapper.update(user);
    }

    @Override
    public Integer delete(Integer id) {
        return userMapper.delete(id);
    }
}
