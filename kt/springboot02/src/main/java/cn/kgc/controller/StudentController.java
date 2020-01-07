package cn.kgc.controller;


import cn.kgc.entity.Student;
import cn.kgc.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("student")
public class StudentController {
    @Autowired
    private StudentService studentService;
    @RequestMapping("queryAll")
    public String queryAll(Model model){
        List<Student> list = studentService.queryAll();
        if (list != null){
            model.addAttribute("list",list);
        }
        return "student_list";
    }
}
