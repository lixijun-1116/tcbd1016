import cn.kgc.entity.User;
import cn.kgc.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext.xml"})
public class UserServiceTest {
    @Autowired
    private UserService userService;
    @Test
    public void test(){
        User user = new User();
        user.setUserName("admin");
        user.setPassword("abc");
        User user1 = userService.login(user);
        if(user1 != null){
            System.out.println("登录成功");
            System.out.println(user1);
        }else{
            System.out.println("登录失败");
        }
    }
}
