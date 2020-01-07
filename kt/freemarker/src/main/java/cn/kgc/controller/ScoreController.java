package cn.kgc.controller;

import cn.kgc.service.ScoreService;
import cn.kgc.vo.Score;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("score")
public class ScoreController {
    @Autowired
    private ScoreService scoreService;
    @RequestMapping("toQuery")
    public String toQuery(Model model){
        List<Score> list = scoreService.query();
        if (null != list){
            model.addAttribute("score_list",list);
        }
        return "score_list";
    }
}
