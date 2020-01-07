package cn.kgc;

import cn.kgc.dao.UserMapper;
import cn.kgc.entity.Grade;
import cn.kgc.entity.User;
import cn.kgc.service.GradeService;
import cn.kgc.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MybatisbootdemoApplicationTests {

    @Autowired
    private GradeService gradeService;
    @Autowired
    private UserService userService;

    @Test
    public void contextLoads() {
        Grade grade = gradeService.queryGradeById(11);
        if (grade != null){
            System.out.println(grade);
        }
    }
    @Test
    public void contextLoads1() {
        User user = new User();
        user.setUserName("admin");
        user.setPassword("abc");
      User login = userService.login(user);
        if (login != null){
            System.out.println("登陆成功");
            return;
        }
        System.out.println("登陆失败");
    }

}
