package cn.kgc.dao;

import cn.kgc.entity.Grade;

import java.util.List;

public interface GradeMapper {
    //查询所有班级
    List<Grade> selectAll();

    Grade selectById(Integer id);
}
