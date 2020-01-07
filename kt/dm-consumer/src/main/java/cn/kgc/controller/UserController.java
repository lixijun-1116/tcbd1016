package cn.kgc.controller;

import cn.kgc.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.Map;

/**
 * Created by Administrator on 2019/12/30/030.
 */
@Controller
public class UserController {

      private String url="http://localhost:8080/user";

    @Autowired
    private RestTemplate restTemplate;

    //查询用户详情
    @ResponseBody
    @RequestMapping(value = "queryById",method = RequestMethod.GET)
    public String queryById(Integer id){
        User user=restTemplate.getForObject(url+"/"+id,User.class);
        System.out.println(user);
        return "success";
    }


    //查询所有用户
    @ResponseBody
    @RequestMapping(value = "queryAll",method = RequestMethod.GET)
    public String queryAll() {
        User[] users=restTemplate.getForObject(url,User[].class);
        System.out.println(Arrays.toString(users));
        return "success";
    }

    //到添加页面
    @RequestMapping("toSave")
    public String toSave(){
        return "save_user";
    }

    //添加用户
    @ResponseBody
    @RequestMapping(value = "save",method = RequestMethod.POST)
    public String save(User user) {
      Map<String,String>map=  restTemplate.postForObject(url,user,Map.class);
      return map.get("msg");
    }

    //去修改(查详情)
    @RequestMapping(value = "toUpdate")
    public String toUpdate(Integer id, Model model){
        User user=restTemplate.getForObject(url+"/"+id,User.class);
        model.addAttribute("user", user);
        return "update_user";

    }

    //修改
    @ResponseBody
    @RequestMapping(value = "update",method = RequestMethod.POST)
    public String update(User user) {

        restTemplate.put(url,user);
        return "success";
    }

    //删除
    @ResponseBody
    @RequestMapping(value = "delete")
    public String delete(Integer id) {
        restTemplate.delete(url+"/"+id);
        return "success";
    }
}
