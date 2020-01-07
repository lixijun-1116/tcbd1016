package cn.kgc.dao;

import cn.kgc.entity.Grade;

import java.util.List;
import java.util.Map;

public interface GradeMapper {

    public List<Grade> queryGrade();

    public List<Grade> queryByForeach_array(Integer [] id);

    public List<Grade> queryByForeach_list(List<Integer> id);

    public List<Grade> queryByForeach_map(Map<String,Object> map);

    public List<Grade> queryByGradeNameAndGradeId(Map<String, Object> map);


}
