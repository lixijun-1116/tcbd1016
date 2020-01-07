package cn.kgc.dao;

import cn.kgc.entity.Student;

import java.util.List;

public interface StudentMapper {

    //查询所有学生
    public List<Student> queryAll();

    //查询学生数量
    public Integer queryCount();

    //添加学生
    public Integer insertStudent(Student student);

    //修改学生
    public Integer updateStudent(Student student);

    //删除学生
    public Integer deleteStudent(Integer id);
}
