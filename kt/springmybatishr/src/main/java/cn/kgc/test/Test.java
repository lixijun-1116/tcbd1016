package cn.kgc.test;

import cn.kgc.controller.UserController;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Test {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserController controller = (UserController)context.getBean("userController");
        controller.index();
    }
}
