package cn.kgc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;


@Controller
@RequestMapping("user")
public class UserController {
    @RequestMapping("login")
    public ModelAndView login(){
        System.out.println("调用了登录方法");
        ModelAndView md = new ModelAndView();
        md.setViewName("loginSuccess");
        return md;
    }
    @RequestMapping("register")
    public ModelAndView register(){

        ModelAndView md = new ModelAndView();
        md.setViewName("register");
        return md;
    }
    @RequestMapping(value = "registerSuccess" ,method = RequestMethod.POST)
    public ModelAndView registerSuccess(String account,String password,String nickName,Integer age){
        System.out.println("account:" +account+",password:"+password+",nickName:"+nickName+",age:"+age);
        System.out.println("调用了注册方法");
        ModelAndView md = new ModelAndView();
        md.setViewName("registerSuccess");
        return md;
    }
    @RequestMapping("exit")
    public ModelAndView exit(){
        System.out.println("调用了注册方法");
        ModelAndView md = new ModelAndView();
        md.setViewName("exitSuccess");
        return md;
    }
}
