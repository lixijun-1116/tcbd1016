import cn.kgc.dao.StudentMapper;
import cn.kgc.entity.Student;
import cn.kgc.util.MyBatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StudentTest {
    @Test
    public void updateStudentTest(){
        Student student = new Student();
        student.setId(100);
        student.setGender("男");
        student.setAge(20);
        Integer count = 0;
        SqlSession sqlSession = null;
        try {
            sqlSession = MyBatisUtil.creatSqlSession();
            count = sqlSession.getMapper(StudentMapper.class).updateAgeAndGender(student);
            sqlSession.commit();
        }catch (Exception e){
            e.printStackTrace();
            sqlSession.rollback();
        }finally {
            MyBatisUtil.closeSqlSession(sqlSession);
        }
        System.out.println(count > 0 ? "修改成功" : "修改失败");

    } @Test
    public void updateAgeAndGenderByMapTest(){
        Map<String,Object> map = new HashMap<>();
        map.put("id",100);
        map.put("gender","女");
        map.put("age",100);

        Integer count = 0;
        SqlSession sqlSession = null;
        try {
            sqlSession = MyBatisUtil.creatSqlSession();
            count = sqlSession.getMapper(StudentMapper.class).updateAgeAndGenderByMap(map);
            sqlSession.commit();
        }catch (Exception e){
            e.printStackTrace();
            sqlSession.rollback();
        }finally {
            MyBatisUtil.closeSqlSession(sqlSession);
        }
        System.out.println(count > 0 ? "修改成功" : "修改失败");

    }
    @Test
    public void selectScoreTest(){
        List<Student> list = null;
        SqlSession sqlSession = null;
        try {
            sqlSession = MyBatisUtil.creatSqlSession();
            list = sqlSession.getMapper(StudentMapper.class).selectScore();
            sqlSession.commit();
        }catch (Exception e){
            e.printStackTrace();
            sqlSession.rollback();
        }finally {
            MyBatisUtil.closeSqlSession(sqlSession);
        }
        if (list != null){
            for (Student student : list) {
                System.out.println(student);
            }
        }
    }
}
