package cn.kgc.dao;

import cn.kgc.entity.Sale;

import java.util.List;

public interface SaleMapper {
    //添加
    Integer insertSale(Sale sale);

    List<Sale> selectAll();
}
