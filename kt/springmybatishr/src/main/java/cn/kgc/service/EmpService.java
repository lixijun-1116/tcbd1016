package cn.kgc.service;

import cn.kgc.entity.Emp;
import cn.kgc.util.PageUtil;

import java.util.List;

public interface EmpService {

    List<Emp> queryAllEmp(Integer did);

    PageUtil<Emp> queryAllEmpPage(Integer did, Integer pageNo, Integer pageSize);
}
