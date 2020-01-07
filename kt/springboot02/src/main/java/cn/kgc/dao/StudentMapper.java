package cn.kgc.dao;

import cn.kgc.entity.Student;

import java.util.List;

public interface StudentMapper {
    //查询所有学生
    List<Student> selectAll();
}
