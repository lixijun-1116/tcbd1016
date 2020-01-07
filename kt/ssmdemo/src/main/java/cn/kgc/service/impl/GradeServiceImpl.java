package cn.kgc.service.impl;

import cn.kgc.dao.GradeMapper;
import cn.kgc.entity.Grade;
import cn.kgc.service.GradeService;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class GradeServiceImpl implements GradeService {
    @Autowired
    private GradeMapper gradeMapper;
    @Override
    public List<Grade> queryGradeByGradeName(String gradeName) {

        return gradeMapper.queryGradeByGradeName(gradeName);
    }

    @Override
    public PageInfo<Grade> queryGradeByGradeName1(String gradeName, Integer pageNo, Integer pageSize) {
        PageHelper.startPage(pageNo,pageSize);
        List<Grade> list = gradeMapper.queryGradeByGradeName(gradeName);
        PageInfo<Grade> pageInfo = new PageInfo<>(list);
        return pageInfo;
    }

    @Override
    public PageInfo<Grade> queryGradeByGradeNamePaiXu(String gradeName, String cloName, Integer pageNo, Integer pageSize) {
        PageHelper.startPage(pageNo,pageSize);
        List<Grade> list = gradeMapper.queryGradeByGradeNamePaiXu(gradeName,cloName);
        PageInfo<Grade> pageInfo = new PageInfo<>(list);
        return pageInfo;
    }

    @Override
    public Integer save(Grade grade) {
        return gradeMapper.insert(grade);
    }
}
