package cn.kgc.controller;

import cn.kgc.entity.User;
import cn.kgc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("user")
public class UserController {
    @Autowired
    private UserService userService;
    @RequestMapping("toLogin")
    public String toLogin(){
        return "login";
    }
    @RequestMapping("login")
    public String login(User user, HttpSession session){
        User user1 = userService.login(user);
        if (user1 != null){
            session.setAttribute("loginUser",user1);
            return "welcome";
        }
        return "login";
    }
}
