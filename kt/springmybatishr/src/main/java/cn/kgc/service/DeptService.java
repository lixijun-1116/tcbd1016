package cn.kgc.service;

import cn.kgc.entity.Dept;

import java.util.List;

public interface DeptService {
    List<Dept> queryDeptByEid(Integer eid);

    List<Dept> queryAllDept();
}
