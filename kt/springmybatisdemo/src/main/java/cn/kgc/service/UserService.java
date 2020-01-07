package cn.kgc.service;

import cn.kgc.entity.User;
import cn.kgc.util.PageUtil;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserService {

    List<User> queryAll();

    PageUtil<User> queryAllPage(Integer pageNo, Integer pageSize);
}
