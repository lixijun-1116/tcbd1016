import cn.kgc.dao.UsersMapper;
import cn.kgc.entity.Users;
import cn.kgc.util.MyBatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

public class UserTest {
    @Test
    public void selectByUserNameAndPasswordTest(){
        SqlSession sqlSession = null;
        Users user = null;
        Users users = new Users();
        users.setUserName("admin");
        users.setPassword("12346");
        try {
            sqlSession = MyBatisUtil.creatSqlSession();
            user = sqlSession.getMapper(UsersMapper.class).selectByUserNameAndPassword(users);
            sqlSession.commit();
        }catch (Exception e){
            e.printStackTrace();
            sqlSession.rollback();
        }finally {
            MyBatisUtil.closeSqlSession(sqlSession);
        }
        if(user != null){
            System.out.println("登录成功");
        }else{
            System.out.println("登录失败");
        }
    }@Test
    public void insertUsers(){
        SqlSession sqlSession = null;
        Integer count =0;
        Users users = new Users();
        users.setUserName("xiaoming");
        users.setPassword("12345");
        users.setAge(14);
        users.setSex(1);
        users.setNickName("小明");
        users.setMobile("18888888888");
        users.setAddress("阿拉斯加");
        users.setSupper(1);;
        users.setPicpath("与i哦怕立刻脚后跟听哟立刻脚后跟");
        try {
            sqlSession = MyBatisUtil.creatSqlSession();
            count = sqlSession.getMapper(UsersMapper.class).insertUsers(users);
            sqlSession.commit();
        }catch (Exception e){
            e.printStackTrace();
            sqlSession.rollback();
        }finally {
            MyBatisUtil.closeSqlSession(sqlSession);
        }
        System.out.println(count > 0 ? "添加成功" : "添加失败");

    }
    @Test
    public void updatePasswordTest(){
        String password = "1";
        Integer id = 3;
        SqlSession sqlSession = null;
        Integer count = 0;
        try {
            sqlSession = MyBatisUtil.creatSqlSession();
            count = sqlSession.getMapper(UsersMapper.class).updatePassword(password,id);
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
    public void deleteUsersTest(){

        Integer id = 3;
        SqlSession sqlSession = null;
        Integer count = 0;
        try {
            sqlSession = MyBatisUtil.creatSqlSession();
            count = sqlSession.getMapper(UsersMapper.class).deleteUsers(id);
            sqlSession.commit();
        }catch (Exception e){
            e.printStackTrace();
            sqlSession.rollback();
        }finally {
            MyBatisUtil.closeSqlSession(sqlSession);
        }
        System.out.println(count > 0 ? "删除成功" : "删除失败");
    }
}
