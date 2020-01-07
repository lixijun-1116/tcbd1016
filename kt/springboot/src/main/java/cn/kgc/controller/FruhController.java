package cn.kgc.controller;

import cn.kgc.entity.Fruh;
import cn.kgc.service.FruhService;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class FruhController {
    @Autowired
    private FruhService fruhService;
    @RequestMapping("main")
    public String queryAll(Integer pageNum, Integer pageSize, Model model){
        PageInfo<Fruh> pageInfo = fruhService.queryAll(pageNum, 5);
        if (pageInfo.getList() != null && pageInfo.getList().size() != 0){
            model.addAttribute("pageInfo",pageInfo);
        }
        return "list";
    }

}
