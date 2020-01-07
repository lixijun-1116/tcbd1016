package cn.kgc.service;

import cn.kgc.entity.Emp;
import cn.kgc.entity.Login;
import cn.kgc.service.LoginService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class LoginTest {
    @Test
    public void test(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        LoginService loginService = (LoginService)context.getBean("loginService");
        Login login1 = new Login();
        Emp emp = new Emp();
        emp.setMobile("15933956279");
        System.out.println(emp);
        login1.setEmp(emp);
        System.out.println(login1.getEmp().getMobile());
        login1.setPassword("123456");

        Login login = loginService.login(login1);
        if (login != null){
            System.out.println(login);
        }
    }
    @Test
    public void test0(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        LoginService loginService = (LoginService)context.getBean("loginService");
        List<Login> list = loginService.select();
        for (Login login : list) {
            System.out.println(login);
        }


    }
}
