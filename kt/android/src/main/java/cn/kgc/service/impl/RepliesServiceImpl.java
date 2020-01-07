package cn.kgc.service.impl;

import cn.kgc.dao.RepliesMapper;
import cn.kgc.entity.Replies;
import cn.kgc.service.RepliesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class RepliesServiceImpl implements RepliesService {

    @Resource
    private RepliesMapper repliesMapper;
    @Override
    public Integer insertReplies(Replies replies) {
        return repliesMapper.insertReplies(replies);
    }
}
