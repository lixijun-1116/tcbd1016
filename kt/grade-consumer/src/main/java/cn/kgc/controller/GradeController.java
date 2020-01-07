package cn.kgc.controller;

import cn.kgc.entity.Grade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;

@Controller
public class GradeController {

    String url = "http://localhost:8080/grade";

    @Autowired
    private RestTemplate restTemplate;


    @RequestMapping(value = "queryAll",method = RequestMethod.GET)
    public String queryAll(Model model){
        Grade[] grades = restTemplate.getForObject(url, Grade[].class);
        System.out.println(Arrays.toString(grades));
        model.addAttribute("grades",grades);
        return "grade_list";
    }

    @ResponseBody
    @RequestMapping(value = "queryById",method = RequestMethod.GET)
    public String queryById(Integer id){
        Grade grade = restTemplate.getForObject(url + "/"+id, Grade.class);
        System.out.println(grade);
        return "success";
    }
}
