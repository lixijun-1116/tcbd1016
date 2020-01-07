package cn.kgc.dao.impl;

import cn.kgc.dao.GradeDao;
import cn.kgc.dao.GradeDao1;
import cn.kgc.entity.Grade;
import org.springframework.stereotype.Repository;

@Repository
public class GradeDaoImpl1 implements GradeDao1 {
    @Override
    public Integer save(Grade grade) {
        System.out.println("班级保存成功" + grade);
        return 1;
    }
}
