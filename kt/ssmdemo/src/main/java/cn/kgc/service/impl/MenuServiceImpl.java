package cn.kgc.service.impl;

import cn.kgc.dao.MenuMapper;
import cn.kgc.entity.Menu;
import cn.kgc.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class MenuServiceImpl implements MenuService {
    @Autowired
    private MenuMapper menuMapper;
    @Override
    public List<Menu> queryAllMenuName(Integer userId) {
        return menuMapper.queryAllMenuName(userId);
    }
}
