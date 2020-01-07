package cn.kgc.controller;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class HelloController {
    @RequestMapping("hello")
    public String hello(Model model){
        model.addAttribute("name","Hello,freeMarker");
        List<String> list = new ArrayList<>();
        list.add("java架构知识");
        list.add("大数据知识");
        list.add("UI知识");
        model.addAttribute("books",list);


        return "Hello";

    }
}
