package cn.kgc.dao;

import cn.kgc.entity.User;

import java.util.List;

/**
 * Created by Administrator on 2019/12/30/030.
 */
public interface UserMapper {

    //查询所有用户
    List<User> queryAll();

    //查询用户详情
    User queryById(Integer id);
    //添加用户
    Integer save(User user);
    //修改用户
    Integer update(User user);

    //删除用户
    Integer delete(Integer id);
}
