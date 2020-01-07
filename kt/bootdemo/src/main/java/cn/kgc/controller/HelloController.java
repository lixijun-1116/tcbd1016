package cn.kgc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("hello")
public class HelloController {
    @ResponseBody
    @RequestMapping("test")
    public String hello(){
        return "hello,spring boot";
    }
}
