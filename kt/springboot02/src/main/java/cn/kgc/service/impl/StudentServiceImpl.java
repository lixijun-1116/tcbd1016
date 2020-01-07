package cn.kgc.service.impl;

import cn.kgc.dao.StudentMapper;
import cn.kgc.entity.Student;
import cn.kgc.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    private StudentMapper studentMapper;
    @Override
    public List<Student> queryAll() {
        return studentMapper.selectAll();
    }
}
