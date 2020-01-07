package cn.kgc.service.impl;

import cn.kgc.dao.StudentMapper;
import cn.kgc.entity.Student;
import cn.kgc.service.StudentService;
import cn.kgc.util.PageUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("studentService")
public class StudentServiceImpl implements StudentService {
    @Autowired
    private StudentMapper studentMapper;
    @Override
    public PageUtil<Student> queryAllPage(Integer pageNo, Integer pageSize) {
        PageUtil<Student> pageUtil = new PageUtil<>();
        Integer count = studentMapper.queryCount();
        pageUtil.setPageNo(pageNo);
        pageUtil.setPageSize(pageSize);
        if(count <= 0){
            pageUtil.setCount(0);
            pageUtil.setTotalPageCount(0);
            return pageUtil;
        }
        Integer from = (pageNo-1)*pageSize;
        List<Student> list = studentMapper.queryAllPage(from,pageSize);
        Integer totalPageCount;
        if(count % pageSize == 0){
            totalPageCount = count / pageSize;
        }else{
            totalPageCount = count / pageSize +1;
        }
        pageUtil.setCount(count);
        pageUtil.setTotalPageCount(totalPageCount);
        pageUtil.setList(list);
        return pageUtil;
    }
}
