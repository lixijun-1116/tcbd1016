package cn.kgc.service.impl;

import cn.kgc.dao.StudentDao;
import cn.kgc.entity.Student;
import cn.kgc.service.StudentService;

public class StudentServiceImpl implements StudentService {
    private StudentDao studentDao;
    public StudentServiceImpl(StudentDao studentDao){
        this.studentDao = studentDao;
    }
    @Override
    public Integer save(Student student) {
        return studentDao.save(student);
    }
}
