package cn.kgc.dao;

import cn.kgc.entity.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface UserMapper {

    //修改
    Integer updateUserById(User user);

    //动态SQL
    List<User> queryUserByUserNameAndNickName(User user);

    //动态SQL
    List<User> queryUserByUserNameAndNickNameNew(User user);

    //动态SQL
    List<User> queryUserByUserNameAndNickNameTrim(User user);

    //查询记录数
    Integer queryCount();

    //查询所有User
    List<User> queryAllUser();

    //添加用户
    Integer insertUser(User user);

    //修改用户
    Integer updateUser(User user);

    //删除用户
    Integer deleteUser(Integer id);

    //用户的模糊查询
    List<User> selectUserByUserName(String userName);

    //用户的两个参数模糊查询(多参,注解)
    List<User> selectUserByUserNameAndNickName(@Param("userName") String userName,@Param("nickName") String nickName);

    //用户的两个参数模糊查询(多参,对象)
    List<User> selectUserByUser(User user);

    //用户的两个参数模糊查询(多参,Map)
    List<User> selectUserByMap(Map<String,String> map);
}
