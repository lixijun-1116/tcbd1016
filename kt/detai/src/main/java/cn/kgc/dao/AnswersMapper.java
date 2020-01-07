package cn.kgc.dao;

import cn.kgc.entity.Answers;

import java.util.List;

public interface AnswersMapper {
    List<Answers> queryAnswers(Integer id);

    Integer insert(Answers answers);
}
