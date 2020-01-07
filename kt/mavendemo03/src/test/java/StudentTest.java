import cn.kgc.dao.StudentMapper;
import cn.kgc.entity.Student;
import cn.kgc.util.MyBatisUtil;
import org.apache.ibatis.jdbc.SQL;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.util.List;

public class StudentTest {
    @Test
    public void queryAllTest(){
        SqlSession sqlSession = null;
        sqlSession = MyBatisUtil.creatSqlSession();
        List<Student> list = sqlSession.getMapper(StudentMapper.class).queryAll();
        MyBatisUtil.closeSqlSession(sqlSession);
        for (Student student: list
             ) {
            System.out.println(student);
        }
    }

    @Test
    public void queryCount(){
        SqlSession sqlSession = MyBatisUtil.creatSqlSession();
        Integer count = sqlSession.getMapper(StudentMapper.class).queryCount();
        MyBatisUtil.closeSqlSession(sqlSession);
        System.out.println("学生总数为：" + count);
    }

    @Test
    public void insertStudentTest(){
        Student student =  new Student();
        student.setGradeId(95);
        student.setStudentName("张三");
        student.setGender("男");
        student.setAge(18);
        student.setStudentNum("555555");
        Integer count = 0;
        SqlSession sqlSession = null;
        try {
            sqlSession = MyBatisUtil.creatSqlSession();
            count = sqlSession.getMapper(StudentMapper.class).insertStudent(student);
            sqlSession.commit();
        }catch (Exception e){
            sqlSession.rollback();
            e.printStackTrace();
        }finally {
            MyBatisUtil.closeSqlSession(sqlSession);
        }
        System.out.println(count>0 ? "添加成功" : "添加失败");
    }

    @Test
    public void updateStudentTest(){
        Student student =  new Student();
        student.setId(129);
        student.setGradeId(90);
        student.setStudentName("张三三");
        student.setGender("女");
        student.setAge(20);
        student.setStudentNum("666666");
        Integer count = 0;
        SqlSession sqlSession = null;
        try {
            sqlSession = MyBatisUtil.creatSqlSession();
            count = sqlSession.getMapper(StudentMapper.class).updateStudent(student);
            sqlSession.commit();
        }catch (Exception e){
            sqlSession.rollback();
            e.printStackTrace();
        }finally {
            MyBatisUtil.closeSqlSession(sqlSession);
        }
        System.out.println(count>0 ? "修改成功" : "修改失败");
    }

    @Test
    public void deleteStudentTest(){
        Integer id = 129;
        Integer count = 0;
        SqlSession sqlSession = null;
        try{
            sqlSession = MyBatisUtil.creatSqlSession();
            count = sqlSession.getMapper(StudentMapper.class).deleteStudent(id);
            sqlSession.commit();
        }catch (Exception e){
            e.printStackTrace();
            sqlSession.rollback();
        }finally {
            MyBatisUtil.closeSqlSession(sqlSession);
        }
        System.out.println(count>0 ? "删除成功" : "删除失败");
    }

}
