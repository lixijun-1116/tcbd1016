package cn.kgc.dao;

import cn.kgc.entity.Users;
import org.apache.ibatis.annotations.Param;

public interface UsersMapper {
    /**
     * 1. 登录功能，要求用户的用户名，如果登录不成功给予错误信息提示，
     */
    public Users selectByUserNameAndPassword(Users users);
    /**
     * 6. 修改个人登陆的密码
     */
    public Integer updatePassword(@Param("password") String password,@Param("id") Integer id);
    /**
     * 7. 添加一个用户
     */
    public Integer insertUsers(Users users);
    /**
     * 8. 删除一个指定用户
     */
    public Integer deleteUsers(Integer id);
}
