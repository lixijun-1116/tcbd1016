package cn.kgc.dao.impl;

import cn.kgc.dao.GradeDao;
import cn.kgc.entity.Grade;

public class GradeDaoImpl implements GradeDao {
    @Override
    public Integer save(Grade grade) {
        System.out.println("班级保存成功" + grade);
        return 1;
    }
}
