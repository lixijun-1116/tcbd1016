package cn.kgc.dao;

import cn.kgc.entity.SmbmsRole;
import org.apache.ibatis.annotations.Param;

import javax.management.relation.Role;
import java.util.List;

public interface RoleMapper {
    Integer updateRole(SmbmsRole role);

    List<SmbmsRole> selectSmbmsRoleByRoleName(@Param("name") String name);
}
