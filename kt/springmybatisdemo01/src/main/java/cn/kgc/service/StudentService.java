package cn.kgc.service;

import cn.kgc.entity.Student;
import cn.kgc.util.PageUtil;

public interface StudentService {

    public PageUtil<Student> queryAllPage(Integer pageNo,Integer pageSize);
}
