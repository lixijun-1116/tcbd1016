package cn.kgc.dao;

import cn.kgc.entity.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserMapper {

    List<User> queryAll();

    Integer queryCount();

    List<User> queryAllPage(@Param("from") Integer from, @Param("pageSize") Integer pageSize);
}
