package cn.kgc.service;

import cn.kgc.entity.Grade;

import java.util.List;

public interface GradeService {

    List<Grade> queryAll();

    Grade queryById(Integer id);
}
