package cn.kgc.service;

import cn.kgc.entity.Answers;

import java.util.List;

public interface AnswersService {
    List<Answers> query(Integer id);

    Integer insert(Answers answers);
}
