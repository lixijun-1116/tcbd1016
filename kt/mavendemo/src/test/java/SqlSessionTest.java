import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;

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
        SqlSessionFactory factory = builder.build(inputStream);
        //SqlSession
        SqlSession sqlSession = factory.openSession();
        //执行SQL
        int count = sqlSession.selectOne("cn.kgc.dao.UserMapper.queryCount");
        //SqlSession关闭
        sqlSession.close();
        System.out.println("用户表记录数为" + count);



    }
}
