package cn.kgc.service.impl;

import cn.kgc.dao.FruhMapper;
import cn.kgc.entity.Fruh;
import cn.kgc.service.FruhService;
import com.github.pagehelper.PageHelper;

import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FruhServiceImpl implements FruhService {
    @Autowired
    private FruhMapper fruhMapper;
    @Override
    public PageInfo<Fruh> queryAll(Integer pageNum, Integer pageSize) {
        if (pageNum == null){
            pageNum =1;
        }
        PageHelper.startPage(pageNum,pageSize);
        List<Fruh> list = fruhMapper.selectAll();
        PageInfo<Fruh> pageInfo = new PageInfo<>(list);
        return pageInfo;
    }
}
