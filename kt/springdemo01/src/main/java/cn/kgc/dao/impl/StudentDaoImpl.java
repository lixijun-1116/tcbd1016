package cn.kgc.dao.impl;

import cn.kgc.dao.StudentDao;
import cn.kgc.entity.Student;

public class StudentDaoImpl implements StudentDao {
    @Override
    public Integer save(Student student) {
        System.out.println("学生对象保存成功" + student);
        return 1;
    }
}
