package cn.kgc.dao;

import cn.kgc.entity.Grade;

public interface GradeMapper {
    //查询班级详情
    Grade selectGradeById(Integer id);
}
