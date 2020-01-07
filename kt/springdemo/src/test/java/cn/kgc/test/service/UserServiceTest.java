package cn.kgc.test.service;

import cn.kgc.entity.User;
import cn.kgc.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserServiceTest {
    @Test
    public void test(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserService userService = (UserService) context.getBean("userService");
        User user = (User)context.getBean("user");
        userService.save(user);
    }


}
