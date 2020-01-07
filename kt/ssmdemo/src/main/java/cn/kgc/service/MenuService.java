package cn.kgc.service;

import cn.kgc.entity.Menu;

import java.util.List;

public interface MenuService {
    public List<Menu> queryAllMenuName(Integer userId);
}
