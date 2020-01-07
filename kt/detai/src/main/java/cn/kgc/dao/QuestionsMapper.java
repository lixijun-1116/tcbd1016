package cn.kgc.dao;

import cn.kgc.entity.Questions;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface QuestionsMapper {

    List<Questions> queryAll();

    Integer insert(Questions questions);

    Questions queryById(Integer id);

    Integer update(@Param("answerCount")Integer answerCount,
                   @Param("id") Integer id);
}
