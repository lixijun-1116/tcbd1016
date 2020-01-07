package cn.kgc.service;

import cn.kgc.entity.Questions;

import java.util.List;

public interface QuestionsService {
    List<Questions> queryAll();

    Integer insert(Questions questions);

    Questions queryById(Integer id);

    Integer update(Integer answerCount, Integer id);
}
