package cn.kgc.controller;

import cn.kgc.entity.Informations;
import cn.kgc.entity.Replies;
import cn.kgc.service.InformationsService;
import cn.kgc.service.RepliesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

@Controller
@RequestMapping("/replies")
public class RepliesController {
    @Resource
    private RepliesService repliesService;
    @Resource
    private InformationsService informationsService;
    @ResponseBody
    @RequestMapping("/insert")
    public String insert(String content, Integer id, Integer replyCount){
        Replies replies = new Replies();
        replies.setContent(content);
        replies.setInfoId(id);
        Integer count = repliesService.insertReplies(replies);
        System.out.println("replyCount:"+replyCount);
        if (count > 0 ){

            Integer count2 = informationsService.updateReplyCount(id,replyCount+1);
            return "success";
        }
        return "error";
    }
}
