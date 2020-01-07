package cn.kgc.service.impl;

import cn.kgc.dao.ScoreMapper;
import cn.kgc.service.ScoreService;
import cn.kgc.vo.Score;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ScoreServiceImpl implements ScoreService {

    @Autowired
    private ScoreMapper scoreMapper;
    @Override
    public List<Score> query() {
        return scoreMapper.select();
    }
}
