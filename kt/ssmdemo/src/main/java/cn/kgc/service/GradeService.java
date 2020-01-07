package cn.kgc.service;

import cn.kgc.entity.Grade;
import com.github.pagehelper.PageInfo;

import java.util.List;

public interface GradeService {
   public List<Grade> queryGradeByGradeName(String gradeName);
   PageInfo<Grade> queryGradeByGradeName1(String gradeName,Integer pageNo,Integer pageSize);
   PageInfo<Grade> queryGradeByGradeNamePaiXu(String gradeName,String cloName,Integer pageNo,Integer pageSize);
   Integer save(Grade grade);
}
