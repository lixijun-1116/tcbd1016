package cn.kgc.controller;

import cn.kgc.entity.User;
import cn.kgc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2019/12/30/030.
 */
@RestController
public class UserController {
    @Resource
    private UserService userService;


    @RequestMapping(value = "user",method = RequestMethod.GET)
    public List<User> queryAll(){
        return userService.queryAll();
    }

    @RequestMapping(value = "user/{uid}",method = RequestMethod.GET)
    public User queryById(@PathVariable("uid") Integer id) {
        return userService.queryById(id);
    }

    @RequestMapping(value = "user",method = RequestMethod.POST)
    public Map<String, String> save(@RequestBody User user) {
        Integer count = userService.save(user);
        Map<String, String> map = new HashMap<>();
        if (count > 0) {
            map.put("msg", "success");
            return map;
        }
        map.put("msg", "error");
        return map;
    }

    @RequestMapping(value = "user",method = RequestMethod.PUT)
    public void update(@RequestBody User user) {
        Integer count = userService.update(user);
       // System.out.println(count);
    }

    @RequestMapping(value = "user/{uid}",method = RequestMethod.DELETE)
    public void delete(@PathVariable("uid") Integer id) {
        Integer count = userService.delete(id);
       // System.out.println(count);
    }
}
