package cn.kgc.service.impl;

import cn.kgc.dao.SaleMapper;
import cn.kgc.entity.Sale;
import cn.kgc.service.SaleService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SaleServiceImpl implements SaleService {
    @Autowired
    private SaleMapper saleMapper;
    @Override
    public Integer insertSale(Sale sale) {
        return saleMapper.insertSale(sale);
    }

    @Override
    public PageInfo<Sale> queryAll(Integer pageNo, Integer pageSize) {
        PageHelper.startPage(pageNo,pageSize);
        List<Sale> list = saleMapper.selectAll();
        PageInfo<Sale> pageInfo = new PageInfo<>(list);
        return pageInfo;
    }
}
