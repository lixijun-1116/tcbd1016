import cn.kgc.dao.StudentHobbyMapper;
import cn.kgc.entity.StudentHobby;
import cn.kgc.util.MyBatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class StudentHobbyTest {
    @Test
    public void selectTest(){
        SqlSession sqlSession = null;
        List<StudentHobby> list = null;
        try {
            sqlSession = MyBatisUtil.creatSqlSession();
            list = sqlSession.getMapper(StudentHobbyMapper.class).select();
            sqlSession.commit();
        }catch (Exception e){
            e.printStackTrace();
            sqlSession.rollback();
        }finally {
            MyBatisUtil.closeSqlSession(sqlSession);
        }
        if (list != null){
            for (StudentHobby studentHobby : list) {
                System.out.println(studentHobby);
            }

        }
    }
}
