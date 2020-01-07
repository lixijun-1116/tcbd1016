import cn.kgc.dao.DeptMapper;
import cn.kgc.entity.Dept;
import cn.kgc.util.MyBatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class DeptTest {
    @Test
    public void selectAllTest(){
        SqlSession sqlSession = null;
        List<Dept> list = null;
        try {
            sqlSession = MyBatisUtil.creatSqlSession();
            list = sqlSession.getMapper(DeptMapper.class).selectAll();
            sqlSession.commit();
        }catch (Exception e){
            e.printStackTrace();
            sqlSession.rollback();
        } finally {
            MyBatisUtil.closeSqlSession(sqlSession);
        }
        if (list != null){
            for (Dept dept : list) {
                System.out.println(dept);
            }
        }
    }
}
