package cn.kgc.service.impl;

import cn.kgc.dao.GradeDao;
import cn.kgc.entity.Grade;
import cn.kgc.service.GradeService;
import lombok.Data;

@Data
public class GradeServiceImpl implements GradeService {
    private GradeDao gradeDao;
    @Override
    public Integer save(Grade grade) {
        return gradeDao.save(grade);
    }
}
