package cn.kgc.service;

import cn.kgc.entity.Student;

import java.util.List;

public interface StudentService {
    public List<Student> queryByGradeName(String gradeName);
}
