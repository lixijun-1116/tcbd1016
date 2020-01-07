package cn.kgc.service.impl;

import cn.kgc.dao.EmpMapper;
import cn.kgc.entity.Emp;
import cn.kgc.service.EmpService;
import cn.kgc.util.PageUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service("empService")
public class EmpServiceImpl implements EmpService {
    @Autowired
    private EmpMapper empMapper;
    @Override
    public List<Emp> queryAllEmp(Integer did) {
        return empMapper.selectEmpByDid(did);
    }

    @Override
    public PageUtil<Emp> queryAllEmpPage(Integer did,Integer pageNo, Integer pageSize) {
        PageUtil<Emp> pageUtil = new PageUtil<>();
        Integer count = empMapper.selectEmpByDidCount(did);
        pageUtil.setPageNo(pageNo);
        pageUtil.setPageSize(pageSize);
        if(count <= 0){
            pageUtil.setCount(0);
            pageUtil.setTotalPageCount(0);
            return pageUtil;
        }
        Integer from = (pageNo-1)*pageSize;
        List<Emp> emps = empMapper.selectEmpByDidPage(from, pageSize, did);
        Integer totalPageCount;
        if(count % pageSize == 0) {
            totalPageCount = count / pageSize;
        }else {
            totalPageCount = count / pageSize + 1;
        }
        pageUtil.setCount(count);
        pageUtil.setTotalPageCount(totalPageCount);
        pageUtil.setList(emps);
        return pageUtil;
    }
}
