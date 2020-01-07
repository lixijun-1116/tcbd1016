package cn.kgc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
@Controller
@RequestMapping("student")
public class StudentController {

    @RequestMapping("studentUpdate")
    public ModelAndView update(Integer id){
        System.out.println(id);
        ModelAndView md = new ModelAndView("update");
        return md;
    }
        @RequestMapping(value = "updateStudent",method = RequestMethod.POST)
    public ModelAndView updateStudent(Integer id,String nickName,Integer age,String gender){
        System.out.println("id:"+id+",nickName:" +nickName+",age:"+age+",gender:"+gender);
        ModelAndView md = new ModelAndView("updateSuccess");
        return md;
    }
}
