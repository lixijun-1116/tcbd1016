package cn.kgc.service;

import cn.kgc.entity.Student;

import java.util.List;

public interface StudentService {
    //查询所有学生
    List<Student> queryAll();
}
