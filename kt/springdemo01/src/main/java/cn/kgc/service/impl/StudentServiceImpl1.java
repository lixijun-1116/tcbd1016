package cn.kgc.service.impl;

import cn.kgc.dao.StudentDao1;
import cn.kgc.entity.Student;
import cn.kgc.service.StudentService1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("studentService1")
public class StudentServiceImpl1 implements StudentService1 {
    @Autowired
    private StudentDao1 studentDao1;
    @Override
    public Integer save(Student student) {
        return studentDao1.save(student);
    }
}
