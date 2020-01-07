package cn.kgc.controller;

import cn.kgc.entity.Users;
import cn.kgc.service.UsersService;
import com.alibaba.fastjson.JSON;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.Map;

import static cn.kgc.util.Common.LOGIN_USER;

@Controller
@RequestMapping("users")
public class UsersController {
    @Autowired
    private UsersService usersService;

    /**
     * 到登录界面
     * @return
     */
    @RequestMapping("toLogin")
    public String toLogin(){
        return "login";
    }

    /**
     * 登录判断
     * @param users
     * @param map
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "loginMsg",method = RequestMethod.POST,produces = {"application/json;charset=UTF-8"})
    public String loginMsg(String userName,String password, Map<String ,String > map){
        Users users1 = usersService.loginByUserNameAndPassword(userName,password);
        System.out.println(users1);
        if (users1 != null){
            map.put("msg","登录成功");
        }else{
            map.put("msg","账号或密码错误");
        }
        String json = JSON.toJSONString(map);
        return json;
    }

    /**
     * 登录
     * @param users
     * @param session
     * @param model
     * @return
     */
    @RequestMapping(value = "login",produces = {"application/json;charset=UTF-8"})
    public String login(String userName,String password, HttpSession session, Model model){
        Users users1 = usersService.loginByUserNameAndPassword(userName,password);
        if (users1 != null){
            session.setAttribute(LOGIN_USER,users1);
            return "welcome";
        }
        return "login";
    }

    /**
     * 退出系统
     * @param session
     * @return
     */
    @RequestMapping(value = "logout",produces = {"application/json;charset=UTF-8"})
    public String logout(HttpSession session){
        session.removeAttribute(LOGIN_USER);
        return "login";
    }

    /**
     * 到top页面
     * @return
     */
    @RequestMapping(value = "toTop",produces = {"application/json;charset=UTF-8"})
    public String toTop(){
        return "top";
    }

    /**
     * 到left页面
     * @return
     */
    @RequestMapping(value = "toLeft",produces = {"application/json;charset=UTF-8"})
    public String toLeft(){
        return "left";
    }

    /**
     * 到main页面
     * @return
     */
    @RequestMapping(value = "toMain",produces = {"application/json;charset=UTF-8"})
    public String toMain(){
        return "main";
    }
}
