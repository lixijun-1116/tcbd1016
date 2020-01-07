package cn.kgc.dao;

import cn.kgc.entity.Menu;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface MenuMapper {
    public List<Menu> queryAllMenuName(Integer userId);


}
