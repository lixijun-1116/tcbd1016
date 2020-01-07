import cn.kgc.dao.StudentHobbyMapper;
import cn.kgc.entity.Hobby;
import cn.kgc.entity.StudentHobby;
import cn.kgc.util.MyBatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class StudentHobbyTest {
    @Test
    public  void selectHobby(){
        List<StudentHobby> list = null;
        SqlSession sqlSession = null;
        try {
            sqlSession = MyBatisUtil.creatSqlSession();
            list = sqlSession.getMapper(StudentHobbyMapper.class).selectHobby();
            System.out.println("个数：" + list.size());
            sqlSession.commit();
        }catch (Exception e){
            e.printStackTrace();
            sqlSession.rollback();
        }finally {
            MyBatisUtil.closeSqlSession(sqlSession);
        }
        for (StudentHobby studentHobby : list) {
            System.out.println(studentHobby);
        }
    }
}
