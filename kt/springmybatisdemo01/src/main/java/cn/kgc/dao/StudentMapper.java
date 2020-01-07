package cn.kgc.dao;

import cn.kgc.entity.Student;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface StudentMapper {

    Integer queryCount();

    List<Student> queryAllPage(@Param("from") Integer from, @Param("pageSize") Integer pageSize);
}
