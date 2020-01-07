package cn.kgc.controller;

import cn.kgc.entity.Grade;
import cn.kgc.service.GradeService;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class GradeController {

    @Autowired
    private GradeService gradeService;
    @RequestMapping(value = "grade",method = RequestMethod.GET)
    public List<Grade> queryAll(){
        return gradeService.queryAll();
    }
    @RequestMapping(value = "grade/{gid}",method = RequestMethod.GET)
    public Grade queryById(@PathVariable("gid") Integer id){
        return gradeService.queryById(id);
    }
}
