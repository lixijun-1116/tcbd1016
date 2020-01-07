package cn.kgc.service.impl;

import cn.kgc.dao.GradeDao;
import cn.kgc.dao.GradeDao1;
import cn.kgc.entity.Grade;
import cn.kgc.service.GradeService;
import cn.kgc.service.GradeService1;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("gradeService1")
public class GradeServiceImpl1 implements GradeService1 {
    @Autowired
    private GradeDao1 gradeDao1;
    @Override
    public Integer save(Grade grade) {
        return gradeDao1.save(grade);
    }
}
