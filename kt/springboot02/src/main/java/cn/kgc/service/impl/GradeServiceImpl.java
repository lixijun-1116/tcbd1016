package cn.kgc.service.impl;

import cn.kgc.dao.GradeMapper;
import cn.kgc.entity.Grade;
import cn.kgc.service.GradeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GradeServiceImpl implements GradeService {
    @Autowired
    private GradeMapper gradeMapper;
    @Override
    public Grade queryGradeById(Integer id) {
        return gradeMapper.selectGradeById(id);
    }
}
