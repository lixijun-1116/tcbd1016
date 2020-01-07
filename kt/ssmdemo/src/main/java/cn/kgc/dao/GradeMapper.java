package cn.kgc.dao;

import cn.kgc.entity.Grade;
import cn.kgc.entity.Menu;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface GradeMapper {
    public List<Grade> queryGradeByGradeName(@Param("gradeName")String gradeName);
    public List<Grade> queryGradeByGradeNamePaiXu(@Param("gradeName")String gradeName,
                                            @Param("colName") String colName);
    public Integer insert(Grade grade);
}
