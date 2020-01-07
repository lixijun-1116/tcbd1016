package cn.kgc.dao;

import cn.kgc.entity.Product;
import cn.kgc.entity.Sale;

import java.util.List;

public interface ProductMapper {

    //查询商品名称
    List<Product> selectAllProductName();

    Product selectAll(Integer id);
}
