package cn.kgc.dao;

import cn.kgc.entity.Student;

import java.util.List;
import java.util.Map;

public interface StudentMapper {
    Integer updateGenderAndAge(Student student);
    Integer updateGenderAndAgeByMap(Map<String,Object> map);
    List<Student> selectStudentScore();

}
