package cn.kgc.dao;

import cn.kgc.entity.Emp;
import org.apache.ibatis.annotations.Param;

import javax.annotation.PostConstruct;
import java.util.List;

public interface EmpMapper {
    List<Emp> selectEmpByDid(Integer did);

    Integer selectEmpByDidCount(Integer did);

    List<Emp> selectEmpByDidPage(@Param("from") Integer from,@Param("pageSize") Integer pageSize ,@Param("did") Integer did);
}
