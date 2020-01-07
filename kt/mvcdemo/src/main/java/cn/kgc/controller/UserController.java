package cn.kgc.controller;

import cn.kgc.entity.User;
import com.alibaba.fastjson.JSON;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("user")
public class UserController {
    //到注册界面
    @RequestMapping("toSave")
    public ModelAndView toSave(){
        ModelAndView modelAndView = new ModelAndView("saveUser");
        return modelAndView;
    }
    //注册方法
    @RequestMapping(value = "saveUser" ,method = RequestMethod.POST)
    public ModelAndView save(User user){
        System.out.println("用户名：" + user.getUserName() + ",密码：" + user.getPassword() + ",昵称：" + user.getNickName() + ",年龄：" + user.getAge());
        ModelAndView modelAndView = new ModelAndView("success");
        user.setId(2);
        modelAndView.addObject("user",user);
        return modelAndView;
    }
    //到登录界面
    @RequestMapping("toLogin")
    public String toLogin(){
        return "login";
    }
    //登录方法
    @RequestMapping(value = "login" , method = RequestMethod.GET)
    public String login(User user, Model model){
        System.out.println("用户名：" + user.getUserName() + ",密码：" + user.getPassword());
        if (user.getUserName().equals("admin") && user.getPassword().equals("123456")){
            return "loginSuccess";
        }
        int a = 1/0;
        model.addAttribute("msg","账号或者密码错误");
        return "login";
    }
    //登录方法login2
    @RequestMapping(value = "login2" , method = RequestMethod.POST)
    public String login2(User user, HttpSession session, Map<String, Object> map){
        System.out.println("用户名：" + user.getUserName() + ",密码：" + user.getPassword());
        if (user.getUserName().equals("admin") && user.getPassword().equals("123456")){
            session.setAttribute("user",user);
            return "loginSuccess";
        }
        map.put("msg2","账号或者密码错误哦");
        return "login";
    }
    //登录方法login3
    @ResponseBody
    @RequestMapping(value = "login3" , method = RequestMethod.POST,produces = {"application/json;charset=UTF-8"})
    public String login3(User user){
        //success代表成功
        Map<String,Object> map = new HashMap<>();
        map.put("msg","登录成功");
        String json = JSON.toJSONString(map);
        System.out.println("json" + json);
        return json;

    }

//    局部异常处理
//    @ExceptionHandler(value = {RuntimeException.class})
//    public String handleException(RuntimeException e, HttpServletRequest request){
//        request.setAttribute("e",e);
//        return "error";
//    }




}
