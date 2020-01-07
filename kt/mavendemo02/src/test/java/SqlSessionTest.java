import cn.kgc.dao.UserMapper;
import cn.kgc.entity.User;
import cn.kgc.util.MyBatisUtil;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SqlSessionTest {

    @Test
    public void updateUserByIdTest(){
        User user = new User();
        user.setId(71);
        user.setUserName("user111");

        user.setNickName("1234567961");
        Integer count = 0;
        SqlSession sqlSession = null;
        try{
            sqlSession = MyBatisUtil.creatSqlSession();
            count = sqlSession.getMapper(UserMapper.class).updateUserById(user);
            sqlSession.commit();
        }catch (Exception e){
            e.printStackTrace();
            sqlSession.rollback();
        }finally {
            MyBatisUtil.closeSqlSession(sqlSession);
        }
        System.out.println(count>0 ? "修改成功" : "修改失败");
    }

    @Test
    public void queryUserByUserNameAndNickNameNewTest(){
        SqlSession sqlSession = null;
        List<User> list = null;
        User user = new User();
        user.setUserName("a");
        user.setNickName("明");
        try {
            sqlSession = MyBatisUtil.creatSqlSession();
            list = sqlSession.getMapper(UserMapper.class).queryUserByUserNameAndNickNameNew(user);
            sqlSession.commit();
        }catch (Exception e){
            e.printStackTrace();
            sqlSession.rollback();
        }finally {
            MyBatisUtil.closeSqlSession(sqlSession);
        }
        if (list != null){
            for (User user1 : list) {
                System.out.println(user1);
            }
        }
    }
    @Test
    public void queryUserByUserNameAndNickNameTrimTest(){
        SqlSession sqlSession = null;
        List<User> list = null;
        User user = new User();
        user.setUserName("a");
        user.setNickName("明");
        try {
            sqlSession = MyBatisUtil.creatSqlSession();
            list = sqlSession.getMapper(UserMapper.class).queryUserByUserNameAndNickNameTrim(user);
            sqlSession.commit();
        }catch (Exception e){
            e.printStackTrace();
            sqlSession.rollback();
        }finally {
            MyBatisUtil.closeSqlSession(sqlSession);
        }
        if (list != null){
            for (User user1 : list) {
                System.out.println(user1);
            }
        }
    }

    @Test
    public void queryUserByUserNameAndNickNameTest(){
        SqlSession sqlSession = null;
        List<User> list = null;
        User user = new User();
        user.setUserName("a");
        user.setNickName("明");
        try {
            sqlSession = MyBatisUtil.creatSqlSession();
            list = sqlSession.getMapper(UserMapper.class).queryUserByUserNameAndNickName(user);
            sqlSession.commit();
        }catch (Exception e){
            e.printStackTrace();
            sqlSession.rollback();
        }finally {
            MyBatisUtil.closeSqlSession(sqlSession);
        }
        if (list != null){
            for (User user1 : list) {
                System.out.println(user1);
            }
        }
    }

    @Test
    public void queryCountTest(){
        SqlSession sqlSession = MyBatisUtil.creatSqlSession();
        Integer count = sqlSession.getMapper(UserMapper.class).queryCount();
        MyBatisUtil.closeSqlSession(sqlSession);
        System.out.println("记录总数为：" + count);
    }

    @Test
    public void queryAllUserTest(){
        SqlSession sqlSession = MyBatisUtil.creatSqlSession();
        List<User> list = sqlSession.getMapper(UserMapper.class).queryAllUser();
        MyBatisUtil.closeSqlSession(sqlSession);
        for (User user : list) {
            System.out.println(user);
        }
    }

    @Test
    public void insertUserTest(){
        User user = new User();
        user.setUserName("user007");
        user.setPassword("123456");
        user.setNickName("欢欢");
        SqlSession sqlSession = null;
        Integer count = 0;
        try {
            sqlSession = MyBatisUtil.creatSqlSession();
            count = sqlSession.getMapper(UserMapper.class).insertUser(user);
            sqlSession.commit();
        }catch (Exception e){
            sqlSession.rollback();
            e.printStackTrace();
        }finally {
            MyBatisUtil.closeSqlSession(sqlSession);
        }
        if(count > 0){
            System.out.println("添加成功");
        }else{
            System.out.println("添加失败");
        }
    }

    @Test
    public void updateUserTest(){
        User user = new User();
        user.setId(73);
        user.setUserName("user008");
        user.setPassword("111");
        user.setNickName("哈哈");
        Integer count = 0;
        SqlSession sqlSession = null;
        try{
            sqlSession = MyBatisUtil.creatSqlSession();
            count = sqlSession.getMapper(UserMapper.class).updateUser(user);
            sqlSession.commit();
        }catch (Exception e){
            e.printStackTrace();
            sqlSession.rollback();
        }finally {
            MyBatisUtil.closeSqlSession(sqlSession);
        }
        System.out.println(count>0 ? "修改成功" : "修改失败");
    }

    @Test
    public void deleteUserTest(){
        Integer id = 72;
        Integer count = 0;
        SqlSession sqlSession = null;
        try{
            sqlSession = MyBatisUtil.creatSqlSession();
            count = sqlSession.getMapper(UserMapper.class).deleteUser(id);
            sqlSession.commit();
        }catch (Exception e){
            e.printStackTrace();
            sqlSession.rollback();
        }finally {
            MyBatisUtil.closeSqlSession(sqlSession);
        }
        System.out.println(count>0 ? "删除成功" : "删除失败");
    }

    @Test
    public void selectUserByUserNameTest(){
        String userName = "a";
        List<User> list = null;
        SqlSession sqlSession = null;
        try {
            sqlSession = MyBatisUtil.creatSqlSession();
            list = sqlSession.getMapper(UserMapper.class).selectUserByUserName(userName);
            sqlSession.commit();
        }catch (Exception e){
            e.printStackTrace();
            sqlSession.rollback();
        }finally {
            MyBatisUtil.closeSqlSession(sqlSession);
        }
        for (User user : list) {
            System.out.println(user);
        }
    }

    @Test
    public void selectUserByUserNameAndNickNameTest() {
        String userName = "a";
        String nickName = "明";
        List<User> list = null;
        SqlSession sqlSession = null;
        try {
            sqlSession = MyBatisUtil.creatSqlSession();
            list = sqlSession.getMapper(UserMapper.class).selectUserByUserNameAndNickName(userName,nickName);
            sqlSession.commit();
        } catch (Exception e) {
            e.printStackTrace();
            sqlSession.rollback();
        } finally {
            MyBatisUtil.closeSqlSession(sqlSession);
        }
        if (list != null) {
            for (User user : list) {
                System.out.println(user);
            }
        }

    }

    @Test
    public void selectUserByUserTest(){
        User user = new User();
        user.setUserName("a");
        user.setNickName("明");
        List<User> list = null;
        SqlSession sqlSession = null;
        try {
            sqlSession = MyBatisUtil.creatSqlSession();
            list = sqlSession.getMapper(UserMapper.class).selectUserByUser(user);
            sqlSession.commit();
        } catch (Exception e) {
            e.printStackTrace();
            sqlSession.rollback();
        } finally {
            MyBatisUtil.closeSqlSession(sqlSession);
        }
        if (list != null) {
            for (User user1 : list) {
                System.out.println(user1);
            }
        }
    }

    @Test
    public void selectUserByMapTest(){
        Map<String , String> map = new HashMap<String ,String>();
        map.put("userName", "a");
        map.put("nickName","明");
        List<User> list = null;
        SqlSession sqlSession = null;
        try {
            sqlSession = MyBatisUtil.creatSqlSession();
            list = sqlSession.getMapper(UserMapper.class).selectUserByMap(map);
            sqlSession.commit();
        } catch (Exception e) {
            e.printStackTrace();
            sqlSession.rollback();
        } finally {
            MyBatisUtil.closeSqlSession(sqlSession);
        }
        if (list != null) {
            for (User user : list) {
                System.out.println(user);
            }
        }
    }
}