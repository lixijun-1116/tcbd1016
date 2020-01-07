import cn.kgc.dao.StudentMapper;
import cn.kgc.entity.Student;
import cn.kgc.util.MyBatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class StudentTest {
    @Test
    public void queryStudentAndGradeTest(){
        SqlSession sqlSession = null;
        List<Student> list = null;
        try {
            sqlSession = MyBatisUtil.creatSqlSession();
            list = sqlSession.getMapper(StudentMapper.class).queryStudentAndGrade();
            sqlSession.commit();
        }catch (Exception e){
            e.printStackTrace();
            sqlSession.rollback();
        }finally {
            MyBatisUtil.closeSqlSession(sqlSession);
        }
        for (Student student : list) {
            System.out.println(student);
        }
    }

    @Test
    public void queryStudentByAgeAndNameAndGenderTest(){
        SqlSession sqlSession = null;
        List<Student> list = null;
        String name = "欢欢";
        String gender = "女";
        Integer age = 10;
        try {
            sqlSession = MyBatisUtil.creatSqlSession();
            list = sqlSession.getMapper(StudentMapper.class).queryStudentByAgeAndNameAndGender(null,gender,age);
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
