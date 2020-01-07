package cn.kgc.controller;

import cn.kgc.entity.Game;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("game")
public class GameController {
    @RequestMapping("toGame")
    public String toGame(){
        return "addAndSelectGame";
    }
    @RequestMapping("toAdd")
    public String toAdd(){
        return "add";
    }

    @ResponseBody
    @RequestMapping(value = "add",method = RequestMethod.POST)
    public String add(Game game,HttpSession session){
        session.setAttribute("game2",game);
        System.out.println("游戏名称：" + game.getGameName() + ",游戏类型：" + game.getGameType() + ",发行公司：" + game.getGameCompany() + ",发行时间："+ game.getGameYear());
        return "addSuccess";
    }
    @RequestMapping("addSuccess")
    public String addSuccess() {
        return "addSuccess";
    }

    @ResponseBody
    @RequestMapping(value = "select",method = RequestMethod.POST)
    public String select(Game game ,HttpSession session){
        session.setAttribute("game1",game);
        System.out.println("游戏名称：" + game.getGameName() + ",游戏类型：" + game.getGameType() + ",发行公司：" + game.getGameCompany() + ",发行时间："+ game.getGameYear());
        return "selectSuccess";
    }
    @RequestMapping(value = "selectSuccess")
    public String selectSuccess(Game game) {
        //System.out.println("游戏名称：" + game.getGameName() + ",游戏类型：" + game.getGameType() + ",发行公司：" + game.getGameCompany() + ",发行时间："+ game.getGameYear());
        return "selectSuccess";
    }
    @ResponseBody
    @RequestMapping("checkmsg")
    public String  checkmsg(String gameName){
        if (gameName.equals("111")){
            return "1";
        }
        return "0";
    }
}
