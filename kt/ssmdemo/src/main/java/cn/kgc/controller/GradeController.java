package cn.kgc.controller;

import cn.kgc.dao.GradeMapper;
import cn.kgc.entity.Grade;
import cn.kgc.service.GradeService;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("grade")
public class GradeController {

    @Autowired
    private GradeService gradeService;

   /* @RequestMapping("toQueryGrade")
    public String toQueryGrade(){
        return "queryGrade";
    }
*/
    @RequestMapping(value = "queryGrade")
    public String queryGrade(String gradeName,Integer pageNo,Integer pageSize,Model model){
        if (pageNo == null){
            pageNo = 1;
        }
        if (pageSize == null){
            pageSize = 5;
        }
        PageInfo<Grade> pageInfo = gradeService.queryGradeByGradeName1(gradeName,pageNo,pageSize);

        if(pageInfo.getList() != null && pageInfo.getList().size() > 0){
            model.addAttribute("pageInfo",pageInfo);
            model.addAttribute("gradeName",gradeName);
            return "queryGrade";
        }
        model.addAttribute("msg","没有找到有关\"" + gradeName + "\"的班级");
        return "queryGrade";
    }
    @RequestMapping(value = "queryGradeByGradeNamePaiXu")
    public String queryGradeByGradeNamePaiXu(String gradeName,String colName,Integer pageNo,Integer pageSize,Model model){
        if (pageNo == null){
            pageNo = 1;
        }
        if (pageSize == null){
            pageSize = 5;
        }
        PageInfo<Grade> pageInfo = gradeService.queryGradeByGradeNamePaiXu(gradeName,colName,pageNo,pageSize);

        if(pageInfo.getList() != null && pageInfo.getList().size() > 0){
            model.addAttribute("pageInfo",pageInfo);
            model.addAttribute("gradeName",gradeName);
            model.addAttribute("colName",colName);
            return "queryGrade";
        }
        model.addAttribute("msg","没有找到有关\"" + gradeName + "\"的班级");
        return "queryGrade";
    }

    @RequestMapping("toSave")
    public String toSave(){
        return "save";
    }
    @RequestMapping("save")
    public String save(Grade grade,Model model){
        Integer count = gradeService.save(grade);
        if (count > 0){
            return "redirect:queryGradeByGradeNamePaiXu";
        }
        model.addAttribute("添加失败，请稍后重试。。。");
        return "save";
    }
}
