package cn.kgc.service.impl;

import cn.kgc.dao.UserMapper;
import cn.kgc.entity.User;
import cn.kgc.service.UserService;
import cn.kgc.util.PageUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service("userService")
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;
    @Override
    public List<User> queryAll() {
        return userMapper.queryAll();
    }



    @Override
    public PageUtil<User> queryAllPage(Integer pageNo, Integer pageSize) {
        PageUtil<User> pageUtil = new PageUtil<>();
        //查询符合条件的记录数
        Integer count = userMapper.queryCount();
        pageUtil.setPageNo(pageNo);
        pageUtil.setPageSize(pageSize);
        if(count <= 0){
            pageUtil.setCount(0);
            pageUtil.setTotalPageCount(0);
            return  pageUtil;
        }

        //计算初始偏移量
        Integer from=(pageNo-1)*pageSize;
        //分页查询用户
        List<User> list = userMapper.queryAllPage(from,pageSize);
        //封装PageUtil
        //计算总有页数
        Integer totalPageCount;
        if (count % pageSize == 0){
            totalPageCount = count / pageSize;
        }else{
            totalPageCount = count /pageSize + 1;
        }
        pageUtil.setTotalPageCount(totalPageCount);
        pageUtil.setCount(count);
        pageUtil.setList(list);
        return pageUtil;
    }
}
