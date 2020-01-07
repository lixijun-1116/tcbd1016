import cn.kgc.dao.StudentMapper;
import cn.kgc.entity.Student;
import cn.kgc.util.MyBatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class StudentTest {
    @Test
    public void selectAllStudentTest(){
        SqlSession sqlSession = MyBatisUtil.creatSqlSession();
        List<Student> list = sqlSession.getMapper(StudentMapper.class).selectAllStudent();
        MyBatisUtil.closeSqlSession(sqlSession);
        for (Student student : list) {
            System.out.println(student);
        }
    }

    @Test
    public void selectCountStudentTest(){
        SqlSession sqlSession = MyBatisUtil.creatSqlSession();
        Integer count = sqlSession.getMapper(StudentMapper.class).selectCountStudent();
        MyBatisUtil.closeSqlSession(sqlSession);
        System.out.println("学生记录数为：" + count);
    }

    @Test
    public void insertStudentTest(){
        Student student = new Student();
        student.setGradeId(96);
        student.setStudentName("大红");
        student.setGender("女");
        student.setAge(20);
        student.setStudentNum("123456789");
        Integer count = 0;
        SqlSession sqlSession = null;
        try{
            sqlSession = MyBatisUtil.creatSqlSession();
            count =  sqlSession.getMapper(StudentMapper.class).insertStudent(student);
            sqlSession.commit();
        }catch (Exception e){
            e.printStackTrace();
            sqlSession.rollback();
        }finally {
            MyBatisUtil.closeSqlSession(sqlSession);
        }
        System.out.println(count>0 ? "添加成功" : "添加失败");
    }

    @Test
    public void updateStudentTest(){
        Student student =  new Student();
        student.setId(131);
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
        Integer id = 131;
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
