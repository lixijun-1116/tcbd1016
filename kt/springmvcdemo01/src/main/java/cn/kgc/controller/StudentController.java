package cn.kgc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("student")
public class StudentController {

    @RequestMapping(value = "add",method = RequestMethod.POST)
    public ModelAndView add(String nickName,Integer age,String gender){
        System.out.println("nickName:" +nickName+",age:"+age+",gender:"+gender);
        ModelAndView md = new ModelAndView("add");
        return  md;
    }
    @RequestMapping("insert")
    public ModelAndView insert(){
        ModelAndView md = new ModelAndView("student");
        return  md;
    }
}
