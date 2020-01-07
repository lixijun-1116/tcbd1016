package cn.kgc.dao.impl;

import cn.kgc.dao.UserDao;
import cn.kgc.entity.User;
import org.springframework.stereotype.Repository;

@Repository
public class UserDaoOracleImpl implements UserDao {
    @Override
    public Integer save(User user) {
        System.out.println("用户保存了 oracle的实现" + user);
        return 1;
    }
}
