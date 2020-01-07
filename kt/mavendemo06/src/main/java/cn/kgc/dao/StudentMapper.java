package cn.kgc.dao;

import cn.kgc.entity.Student;

import java.util.List;
import java.util.Map;

public interface StudentMapper {
    Integer updateAgeAndGender(Student student);
    Integer updateAgeAndGenderByMap(Map<String, Object> map);
    List<Student> selectScore();
}
