package cn.kgc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
@Controller
@RequestMapping("hello")
public class HelloController {
    @RequestMapping(value = "hi", method = RequestMethod.GET)
    public ModelAndView hi(){
        System.out.println("调用了HelloController的hi方法");
        ModelAndView md = new ModelAndView("welcome");
        return md;
    }
}
