import cn.kgc.dao.StudentMapper;
import cn.kgc.entity.Student;
import cn.kgc.util.MyBatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StudentTest {
    @Test
    public void updateGenderAndAgeTest(){
        Student student = new Student();
        student.setId(128);
        student.setGender("男");
        student.setAge(80);
        Integer count = 0;
        SqlSession sqlSession = null;
        try {
            sqlSession = MyBatisUtil.creatSqlSession();
            count =sqlSession.getMapper(StudentMapper.class).updateGenderAndAge(student);
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
    public void updateGenderAndAgeByMapTest(){
        Map<String,Object> map = new HashMap<>();
        map.put("id",128);
        map.put("gender","女");
        map.put("age",90);
        Integer count = 0;
        SqlSession sqlSession = null;
        try {
            sqlSession = MyBatisUtil.creatSqlSession();
            count =sqlSession.getMapper(StudentMapper.class).updateGenderAndAgeByMap(map);
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
    public void selectStudentScore(){
        List<Student> list = new ArrayList<>();
        SqlSession sqlSession =null;
        try {
            sqlSession = MyBatisUtil.creatSqlSession();
            list = sqlSession.getMapper(StudentMapper.class).selectStudentScore();
            sqlSession.commit();
        }catch (Exception e){
            e.printStackTrace();
            sqlSession.rollback();
        }finally {
            MyBatisUtil.closeSqlSession(sqlSession);
        }
        if(list != null){
            for (Student student : list) {
                System.out.println(student);
            }
        }
    }
}
