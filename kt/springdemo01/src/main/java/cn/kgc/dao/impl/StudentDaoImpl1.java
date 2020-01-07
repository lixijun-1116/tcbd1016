package cn.kgc.dao.impl;


import cn.kgc.dao.StudentDao1;
import cn.kgc.entity.Student;
import org.springframework.stereotype.Repository;

@Repository
public class StudentDaoImpl1 implements StudentDao1 {

    @Override
    public Integer save(Student student) {
        System.out.println("学生对象保存成功" + student);
        return 1;
    }
}
