package cn.kgc.service.impl;

import cn.kgc.dao.AnswersMapper;
import cn.kgc.entity.Answers;
import cn.kgc.service.AnswersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class AnswersServiceImpl implements AnswersService {
    @Autowired
    private AnswersMapper answersMapper;
    @Override
    public List<Answers> query(Integer id) {
        return answersMapper.queryAnswers(id);
    }

    @Override
    public Integer insert(Answers answers) {
        return answersMapper.insert(answers);
    }
}
