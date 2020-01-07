import cn.kgc.entity.TUser;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class SqlSessionTest {
    @Test
    public void queryCount(){
        InputStream inputStream = null;
        try {
            inputStream = Resources.getResourceAsStream("mybatis-config.xml");
        } catch (IOException e) {
            e.printStackTrace();
        }
        //SqlSessionFactoryBuilder
        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
        //SqlSessionFactory
        SqlSessionFactory build = builder.build(inputStream);
        //SqlSession
        SqlSession sqlSession = build.openSession();
        //运行SQL
        int count = sqlSession.selectOne("cn.kgc.dao.UserMapper.queryCount");
        sqlSession.close();
        //输出结果
        System.out.println("用户的数量为:" + count);
    }
    @Test
    public void queryAllUser(){
        InputStream inputStream = null;
        try {
            inputStream = Resources.getResourceAsStream("mybatis-config.xml");
        } catch (IOException e) {
            e.printStackTrace();
        }
        //SqlSessionFactoryBuilder
        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
        //SqlSessionFactory
        SqlSessionFactory build = builder.build(inputStream);
        //SqlSession
        SqlSession sqlSession = build.openSession();
        //运行SQL
        List<TUser> list = sqlSession.selectList("cn.kgc.dao.UserMapper.queryAllUser");
        sqlSession.close();
        //输出结果
        for (TUser tuser:list) {
            System.out.println("id:" + tuser.getId() + "\n账号：" + tuser.getUser_name() + "\n密码：" + tuser.getPassword() + "\n姓名：" + tuser.getNick_name() + "\n");
        }
    }
    @Test
    public void queryTUserByNickname(){
        InputStream inputStream = null;
        try {
            inputStream = Resources.getResourceAsStream("mybatis-config.xml");
        } catch (IOException e) {
            e.printStackTrace();
        }
        //SqlSessionFactoryBuilder
        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
        //SqlSessionFactory
        SqlSessionFactory build = builder.build(inputStream);
        //SqlSession
        SqlSession sqlSession = build.openSession();
        //运行SQL
        List<TUser> list = sqlSession.selectList("cn.kgc.dao.UserMapper.queryTUserName");
        sqlSession.close();
        //输出结果
        for (TUser tuser:list) {
            System.out.println("id:" + tuser.getId() + "账号：" + tuser.getUser_name() + "密码：" + tuser.getPassword() + "姓名：" + tuser.getNick_name());
        }
    }
}
