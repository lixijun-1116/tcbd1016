package cn.kgc.controller;

import cn.kgc.entity.Student;
import cn.kgc.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
@RequestMapping("student")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @RequestMapping("toHome")
    public String toHome(){
        return "Home";
    }

    //到查询见面
    @RequestMapping("toQuery")
    public String toQuery(){
        return "query";
    }
    @RequestMapping(value = "query",method = RequestMethod.POST)
    public String query(String gradeName, Model model){
        System.out.println(gradeName);
        List<Student> list = studentService.queryByGradeName(gradeName);
        if (list != null && list.size()>0){
            model.addAttribute("list",list);
            return "query";
        }


        model.addAttribute("msg","请输入正确的班级名称");
        return "query";
    }
}
