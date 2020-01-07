package cn.kgc.dao;

import cn.kgc.entity.Student;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface StudentMapper {

    //查询学生的所在班级
    List<Student> queryStudentAndGrade();

    List<Student> queryStudentByAgeAndNameAndGender(@Param("name") String name,
                                                    @Param("gender") String gender,
                                                    @Param("age") Integer age);
}
