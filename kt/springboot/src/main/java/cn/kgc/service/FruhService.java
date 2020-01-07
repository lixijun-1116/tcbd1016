package cn.kgc.service;

import cn.kgc.entity.Fruh;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageInfo;

public interface FruhService {
    PageInfo<Fruh> queryAll(Integer pageNum,Integer pageSize);
}
