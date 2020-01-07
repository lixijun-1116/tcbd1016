package cn.kgc.dao;

import cn.kgc.entity.Student;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface StudentMapper {
    public List<Student> selectByGradeName(@Param("gradeName") String gradeName);
}
