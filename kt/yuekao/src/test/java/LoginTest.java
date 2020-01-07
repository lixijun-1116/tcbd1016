import cn.kgc.dao.LoginMapper;
import cn.kgc.entity.Emp;
import cn.kgc.entity.Login;
import cn.kgc.util.MyBatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

public class LoginTest {
    @Test
    public void selectByAccountOrMobileAndPasswordTest(){
        Login login = new Login();
        //login.setAccount("sunyize");
        Emp emp = new Emp();
        emp.setMobile("15131617032");
        login.setEmp(emp);
        login.setPassword("123456");
        SqlSession sqlSession = null;
        Login login1 = null;
        try {
            sqlSession = MyBatisUtil.creatSqlSession();
            login1 = sqlSession.getMapper(LoginMapper.class).selectByAccountOrMobileAndPassword(login);
            sqlSession.commit();
        }catch (Exception e){
            e.printStackTrace();
            sqlSession.rollback();
        }finally {
            MyBatisUtil.closeSqlSession(sqlSession);
        }
        if (login1!= null){
            System.out.println("登录成功");
            System.out.println("操作者：" + login1.getEmp().getLastName());

        }else{
            System.out.println("账号或密码错误");
        }
    }
    @Test
    public void selectByAccountOrMobileAndPasswordRbacTest(){
        Login login = new Login();
        //login.setAccount("sunyize");
        Emp emp = new Emp();
        emp.setMobile("15131617032");
        login.setEmp(emp);
        login.setPassword("123456");
        SqlSession sqlSession = null;
        Login login1 = null;
        try {
            sqlSession = MyBatisUtil.creatSqlSession();
            login1 = sqlSession.getMapper(LoginMapper.class).selectByAccountOrMobileAndPasswordRbac(login);
            sqlSession.commit();
        }catch (Exception e){
            e.printStackTrace();
            sqlSession.rollback();
        }finally {
            MyBatisUtil.closeSqlSession(sqlSession);
        }
        if (login1!= null){
            System.out.println("登录成功");

            System.out.println("账号：" + login1.getAccount());
            System.out.println("密码：" + login1.getPassword());
            System.out.println("手机：" + login1.getEmp().getMobile());
            System.out.println("部门：" + login1.getDept().getName());

        }else{
            System.out.println("账号或密码错误");
        }
    }
}
