package cn.kgc.controller;

import cn.kgc.entity.Student;
import com.alibaba.fastjson.JSON;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import sun.plugin2.message.GetAppletMessage;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("student")
public class StudentController {
    //查询用户详情
    @ResponseBody
    @RequestMapping(value = "queryById",method = RequestMethod.GET,produces = {"application/json;charset=UTF-8"})
    public String queryById(Integer id){
        //通过id查询用户
        Student st1 = new Student();
        st1.setId(id);
        st1.setStudentName("小明");
        st1.setAge(18);
        st1.setGender("男");
        String json = JSON.toJSONString(st1);
        return json;
    }

    @RequestMapping(value = "queryAll",method = RequestMethod.GET)
    public String queryAll(Model model){
        List<Student> list = new ArrayList<>();
        Student st1 = new Student();
        st1.setId(1);
        st1.setStudentName("小明");
        st1.setAge(18);
        st1.setGender("男");
        Student st2 = new Student();
        st2.setId(2);
        st2.setStudentName("小红");
        st2.setAge(20);
        st2.setGender("男");
        Student st3 = new Student();
        st3.setId(3);
        st3.setStudentName("小黑");
        st3.setAge(21);
        st3.setGender("女");
        list.add(st1);
        list.add(st2);
        list.add(st3);
        model.addAttribute("list",list);
        return "student_list";

    }
}
