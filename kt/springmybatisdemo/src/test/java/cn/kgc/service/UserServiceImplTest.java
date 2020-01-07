package cn.kgc.service;

import cn.kgc.entity.User;
import cn.kgc.util.PageUtil;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class UserServiceImplTest {
    @Test
    public void queryAll(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserService userService = (UserService) context.getBean("userService");
        List<User> list = userService.queryAll();
        if (list != null){
            for (User user : list) {
                System.out.println(user);
            }
        }
    }
    @Test
    public void queryAllPage(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserService userService = (UserService) context.getBean("userService");
        PageUtil<User> pageUtil = userService.queryAllPage(1,5);
        System.out.println("当前：" + pageUtil.getPageNo());
        System.out.println("共：" + pageUtil.getTotalPageCount());
        if (pageUtil.getCount() > 0){
            List<User> list = pageUtil.getList();
            if (list != null) {
                for (User user : list) {
                    System.out.println(user);
                }
            }
        }
    }
}
