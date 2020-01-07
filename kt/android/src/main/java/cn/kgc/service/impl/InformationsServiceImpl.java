package cn.kgc.service.impl;

import cn.kgc.dao.InformationsMapper;
import cn.kgc.entity.Informations;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;



import cn.kgc.service.InformationsService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class InformationsServiceImpl implements InformationsService {

    @Resource
    private InformationsMapper informationsMapper;
    @Override
    public PageInfo<Informations> queryAll(Integer pageNum, Integer pageSize) {
        if (pageNum == null){
            pageNum =1;
        }
        PageHelper.startPage(pageNum,pageSize);
        List<Informations> list = informationsMapper.selectAll();
        PageInfo<Informations> pageInfo = new PageInfo<>(list);
        return pageInfo;
    }

    @Override
    public Informations queryBuId(Integer id) {
        return informationsMapper.selectById(id);
    }

    @Override
    public Integer updateViewCount(Integer id, Integer viewCount) {
        return informationsMapper.updateViewCount(id,viewCount);
    }

    @Override
    public Integer updateReplyCount(Integer id, Integer replyCount) {
        return informationsMapper.updateReplyCount(id,replyCount);
    }
}
