package cn.kgc.service;

import cn.kgc.entity.Product;

import java.util.List;

public interface ProductService {
    List<Product> selectAllProductName();

    Product selectAll(Integer id);
}
