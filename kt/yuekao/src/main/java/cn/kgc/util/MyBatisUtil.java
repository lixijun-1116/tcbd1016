package cn.kgc.util;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

public class MyBatisUtil {
    private static InputStream inputStream = null;
    private static SqlSessionFactory sqlSessionFactory = null;
    static{
        try {
            inputStream = Resources.getResourceAsStream("mybatis-config.xml");
            SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
            sqlSessionFactory = sqlSessionFactoryBuilder.build(inputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    /**
     * 创建SqlSession
     */
    public static SqlSession creatSqlSession(){
        return sqlSessionFactory.openSession();
    }
    /**
     * 关闭SqlSession
     */
    public static void closeSqlSession(SqlSession sqlSession){
        if (sqlSession != null){
            sqlSession.close();
        }
    }
}