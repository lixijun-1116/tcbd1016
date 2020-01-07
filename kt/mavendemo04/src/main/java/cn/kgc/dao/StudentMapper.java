package cn.kgc.dao;

import cn.kgc.entity.Student;

import java.util.List;

public interface StudentMapper {

    //查询所有学生
    List<Student> selectAllStudent();

    //查询所有学生的数量
    Integer selectCountStudent();

    //添加学生
    Integer insertStudent(Student student);

    //修改学生
    Integer updateStudent(Student student);

    //删除学生
    Integer deleteStudent(Integer id);

}
