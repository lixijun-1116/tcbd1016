import cn.kgc.dao.RoleMapper;
import cn.kgc.entity.SmbmsRole;
import cn.kgc.util.BaseDateUitls;
import cn.kgc.util.MyBatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.text.ParseException;
import java.util.List;


public class RoleTest {
    @Test
    public void updateRoleTest() throws ParseException {
        SmbmsRole role = new SmbmsRole();
        role.setId(4);
        role.setRoleCode("xingxing");
        role.setCreatedBy(3);
        role.setRoleName("管理员");
        role.setCreationDate(BaseDateUitls.parse("2019-10-20","yyyy-MM-dd"));
        role.setModifyBy(4);
        role.setModifyDate(BaseDateUitls.parse("2019-11-25","yyyy-MM-dd"));
        SqlSession sqlSession = null;
        Integer count = 0;
        try {
            sqlSession = MyBatisUtil.creatSqlSession();
            count = sqlSession.getMapper(RoleMapper.class).updateRole(role);
            sqlSession.commit();
        }catch (Exception e){
            e.printStackTrace();
            sqlSession.rollback();
        }finally {
            MyBatisUtil.closeSqlSession(sqlSession);
        }
        System.out.println(count > 0 ? "修改成功" : "修改失败");
    }

    @Test
    public void selectSmbmsRoleByRoleNameTest(){
        String name = "员";
        SqlSession sqlSession = null;
        List<SmbmsRole> list = null;
        try {
            sqlSession = MyBatisUtil.creatSqlSession();
            list = sqlSession.getMapper(RoleMapper.class).selectSmbmsRoleByRoleName(name);
            sqlSession.commit();
        }catch (Exception e){
            e.printStackTrace();
            sqlSession.rollback();
        }finally {
            MyBatisUtil.closeSqlSession(sqlSession);
        }
        if (list != null){
            for (SmbmsRole role : list) {
                System.out.println(role);
            }
        }
    }
}
