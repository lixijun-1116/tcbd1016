package cn.kgc.controller;

import cn.kgc.entity.Informations;
import cn.kgc.service.InformationsService;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.annotation.Resource;

@Controller
public class InformationsController {

    @Resource
    private InformationsService informationsService;
    @RequestMapping("/queryAll")
    public String queryAll(Integer pageNum, Model model){
        PageInfo<Informations> pageInfo = informationsService.queryAll(pageNum, 2);
        if (pageInfo.getList() != null && pageInfo.getList().size() !=  0){
            model.addAttribute("pageInfo",pageInfo);
        }
        return "informations_list";
    }



    @RequestMapping(value = "/queryById",method = RequestMethod.GET)
    public String queryById(Integer id,Model model){
        Informations informations = informationsService.queryBuId(id);
        if (informations != null){
            System.out.println(informations);
            System.out.println(id);
            System.out.println(informations.getViewCount());
            System.out.println(informations.getViewCount()+1);
            Integer count = informationsService.updateViewCount(id, informations.getViewCount()+1);
            model.addAttribute("informations",informations);
        }
        return "query_id";
    }
}
