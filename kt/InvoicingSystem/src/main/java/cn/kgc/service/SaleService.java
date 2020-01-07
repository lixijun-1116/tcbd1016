package cn.kgc.service;

import cn.kgc.entity.Sale;
import com.github.pagehelper.PageInfo;
import org.apache.ibatis.annotations.Param;

public interface SaleService {
    //添加
    Integer insertSale(Sale sale);

    PageInfo<Sale> queryAll(@Param("pageNo") Integer pageNo,
                            @Param("pageSize") Integer pageSize);
}
