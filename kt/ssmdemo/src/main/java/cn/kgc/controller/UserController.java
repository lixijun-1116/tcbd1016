package cn.kgc.controller;

import cn.kgc.entity.Menu;
import cn.kgc.entity.User;
import cn.kgc.service.MenuService;
import cn.kgc.service.UserService;
import cn.kgc.util.Common;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
@RequestMapping("user")
public class UserController {
    @Autowired
    private UserService userService;
    @Autowired
    private MenuService menuService;
    @RequestMapping("toLogin")
    public String  toLogin(){
        return "login";
    }

    @RequestMapping(value = "login",method = RequestMethod.POST)
    public String login(User user, HttpSession session,Model model){
        if(session.getAttribute(Common.LOGIN_USER) != null && session.getAttribute(Common.LOGIN_USER) != ""){
            return "welcome";
        }
        User login = userService.login(user);
        if (login != null){
            session.setAttribute(Common.LOGIN_USER,login);
            return "welcome";
        }
        model.addAttribute("msg","账号或密码错误");
        return "login";
    }



    @RequestMapping("logout")
    public  String logout(HttpSession session){
        session.removeAttribute(Common.LOGIN_USER);
        return "login";
    }

    @RequestMapping("toTop")
    public String toTop(){
        return "top";
    }
    @RequestMapping("toLeft")
    public String toLeft(HttpSession session,Model model){
        User user = (User) session.getAttribute(Common.LOGIN_USER);
        System.out.println(user.getId());

        List<Menu> list = menuService.queryAllMenuName(user.getId());
        System.out.println(list);
        model.addAttribute("list",list);
        return "left";
    }
    @RequestMapping("toMain")
    public String toMain(){
        return "main";
    }

}
