package cn.kgc.service;

import cn.kgc.entity.Informations;
import com.github.pagehelper.PageInfo;
import org.apache.ibatis.annotations.Param;

public interface InformationsService {
    PageInfo<Informations> queryAll(Integer pageNum,Integer pageSize);

    Informations queryBuId(Integer id);

    Integer updateViewCount(Integer id, Integer viewCount);
    Integer updateReplyCount(Integer id, Integer replyCount);
}
