package cn.kgc.controller;

import cn.kgc.entity.Answers;
import cn.kgc.entity.Questions;
import cn.kgc.service.AnswersService;
import cn.kgc.service.QuestionsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
@RequestMapping("questions")
public class QuestionsController {
    @Autowired
    private QuestionsService questionsService;
    @Autowired
    private AnswersService answersService;

    @RequestMapping("query")
    public String query(Model model){
        List<Questions> list = questionsService.queryAll();
        if (list != null && list.size() > 0){
            model.addAttribute("allQuestions",list);
        }
        return "query";
    }

    @RequestMapping("toSave")
    public String toSave(){
        return "save";
    }

    @RequestMapping(value = "save",method = RequestMethod.POST)
    public String save(Questions questions,Model model){
        Integer count = questionsService.insert(questions);
        if (count > 0){
            return "query";
        }
        model.addAttribute("msg","添加失败");
        return "save";
    }

    @RequestMapping("queryByQid")
    public String queryByQid(Integer id,Model model){
        Questions questions = questionsService.queryById(id);
        if (questions != null ){
            model.addAttribute("Questions",questions);
        }
        List<Answers> answersList = answersService.query(id);
        if (answersList != null && answersList.size() > 0){
            model.addAttribute("answersList",answersList);
        }
        return "main";
    }

    @RequestMapping(value = "insert",method = RequestMethod.POST)
    public String insert(Answers answers,Model model){
        System.out.println(answers);
        Integer count = answersService.insert(answers);
        if (count > 0){
            Questions questions = questionsService.queryById(answers.getQid());
            Integer update = questionsService.update(questions.getAnswerCount() + 1, questions.getId());
            System.out.println(update);
            return "query";
        }
        model.addAttribute("msg","添加失败");
        return "main";
    }
}
