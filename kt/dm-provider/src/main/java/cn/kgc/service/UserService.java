package cn.kgc.service;

import cn.kgc.entity.User;

import java.util.List;

/**
 * Created by Administrator on 2019/12/30/030.
 */
public interface UserService {

    List<User> queryAll();

    User queryById(Integer id);

    Integer save(User user);

    Integer update(User user);

    Integer delete(Integer id);
}
