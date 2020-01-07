package cn.kgc.dao;

import cn.kgc.entity.Dept;

import java.util.List;

public interface DeptMapper {

    List<Dept> queryDeptByEid(Integer eid);

    List<Dept> queryAllDept();
}
