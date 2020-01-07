package cn.kgc.service.impl;

import cn.kgc.dao.ProductMapper;
import cn.kgc.entity.Product;
import cn.kgc.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    private ProductMapper productMapper;
    @Override
    public List<Product> selectAllProductName() {
        return productMapper.selectAllProductName();
    }

    @Override
    public Product selectAll(Integer id) {
        return productMapper.selectAll(id);
    }
}
