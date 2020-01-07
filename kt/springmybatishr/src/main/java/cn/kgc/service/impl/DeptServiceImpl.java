package cn.kgc.service.impl;

import cn.kgc.dao.DeptMapper;
import cn.kgc.entity.Dept;
import cn.kgc.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service("deptService")
public class DeptServiceImpl implements DeptService {
    @Autowired
    private DeptMapper deptMapper;
    @Override
    public List<Dept> queryDeptByEid(Integer eid) {
        return deptMapper.queryDeptByEid(eid);
    }

    @Override
    public List<Dept> queryAllDept() {
        return deptMapper.queryAllDept();
    }
}
