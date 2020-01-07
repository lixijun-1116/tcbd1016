package cn.kgc.test;

import cn.kgc.entity.Who;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class WhoTest {
    @Test
    public void test01(){
       ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
       Who who = (Who)context.getBean("who");
       who.print();
    }
}
