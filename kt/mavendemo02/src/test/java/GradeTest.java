import cn.kgc.dao.GradeMapper;
import cn.kgc.entity.Grade;

import cn.kgc.util.MyBatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GradeTest {
    @Test
    public void queryGradeTest(){
        SqlSession sqlSession = null;
        List<Grade> list = null;
        try {
            sqlSession = MyBatisUtil.creatSqlSession();
            list = sqlSession.getMapper(GradeMapper.class).queryGrade();
            sqlSession.commit();
        }catch (Exception e){
            e.printStackTrace();
            sqlSession.rollback();
        }finally {
            MyBatisUtil.closeSqlSession(sqlSession);
        }
        for (Grade grade : list) {
            System.out.println(grade);
        }
    }
    @Test
    public void queryByForeach_arrayTest(){
        SqlSession sqlSession = null;
        Integer [] sid = {88,89,90};
        List<Grade> list = null;

        try {
            sqlSession = MyBatisUtil.creatSqlSession();
            list = sqlSession.getMapper(GradeMapper.class).queryByForeach_array(sid);
            sqlSession.commit();
        }catch (Exception e){
            e.printStackTrace();
            sqlSession.rollback();
        }finally {
            MyBatisUtil.closeSqlSession(sqlSession);
        }
        if (list!=null){
            for (Grade grade : list) {
                System.out.println(grade);
            }
        }
    } @Test
    public void queryByForeach_listTest(){
        SqlSession sqlSession = null;
        List<Integer> integerList = new ArrayList<Integer>();
        integerList.add(88);
        integerList.add(89);
        integerList.add(90);
        List<Grade> list = null;
        try {
            sqlSession = MyBatisUtil.creatSqlSession();
            list = sqlSession.getMapper(GradeMapper.class).queryByForeach_list(integerList);
            sqlSession.commit();
        }catch (Exception e){
            e.printStackTrace();
            sqlSession.rollback();
        }finally {
            MyBatisUtil.closeSqlSession(sqlSession);
        }
        if (list!=null){
            for (Grade grade : list) {
                System.out.println(grade);
            }
        }
    }
    @Test
    public void queryByForeach_mapTest(){
        SqlSession sqlSession = null;
        Map<String,Object> map = new HashMap<>();
        List<Integer> integerList = new ArrayList<Integer>();
        integerList.add(88);
        integerList.add(89);
        integerList.add(90);
        map.put("list",integerList);
        List<Grade> list = null;
        try {
            sqlSession = MyBatisUtil.creatSqlSession();
            list = sqlSession.getMapper(GradeMapper.class).queryByForeach_map(map);
            sqlSession.commit();
        }catch (Exception e){
            e.printStackTrace();
            sqlSession.rollback();
        }finally {
            MyBatisUtil.closeSqlSession(sqlSession);
        }
        if (list!=null){
            for (Grade grade : list) {
                System.out.println(grade);
            }
        }
    }
    @Test
    public void queryByGradeNameAndGradeIdTest(){
        SqlSession sqlSession = null;
        Map<String,Object> map = new HashMap<>();
        List<Integer> integerList = new ArrayList<Integer>();
        integerList.add(88);
        integerList.add(89);
        integerList.add(90);
        map.put("list",integerList);
        map.put("gradeName", "0");
        List<Grade> list = null;
        try {
            sqlSession = MyBatisUtil.creatSqlSession();
            list = sqlSession.getMapper(GradeMapper.class).queryByGradeNameAndGradeId(map);
            sqlSession.commit();
        }catch (Exception e){
            e.printStackTrace();
            sqlSession.rollback();
        }finally {
            MyBatisUtil.closeSqlSession(sqlSession);
        }
        if (list!=null){
            for (Grade grade : list) {
                System.out.println(grade);
            }
        }
    }
}
