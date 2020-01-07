package cn.kgc.service.impl;

import cn.kgc.dao.QuestionsMapper;
import cn.kgc.entity.Questions;
import cn.kgc.service.QuestionsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class QuestionsServiceImpl implements QuestionsService {
    @Autowired
    private QuestionsMapper questionsMapper;
    @Override
    public List<Questions> queryAll() {
        return questionsMapper.queryAll();
    }

    @Override
    public Integer insert(Questions questions) {
        return questionsMapper.insert(questions);
    }

    @Override
    public Questions queryById(Integer id) {
        return questionsMapper.queryById(id);
    }

    @Override
    public Integer update(Integer answerCount,Integer id) {
        return questionsMapper.update(answerCount,id);
    }
}
