import cn.kgc.entity.Users;
import cn.kgc.service.UsersService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext.xml"})
public class UsersServiceImplTest {
    @Autowired
    private UsersService usersService;
    @Test
    public void test(){
        String userName = "zhaoliu";
        String password = "123456";
        Users users1 = usersService.loginByUserNameAndPassword(userName,password);
        if (users1 != null){
            System.out.println("真实名称：" + users1.getRealName());
        }
    }
}
