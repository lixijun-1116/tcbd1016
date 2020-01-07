package cn.kgc.dao;

import cn.kgc.entity.Informations;


import org.apache.ibatis.annotations.Param;

import java.util.List;


public interface InformationsMapper {

    List<Informations> selectAll();

    Informations selectById(@Param("id") Integer id);

    Integer updateViewCount(@Param("id") Integer id,
                            @Param("viewCount") Integer viewCount);

    Integer updateReplyCount(@Param("id") Integer id,
                            @Param("replyCount") Integer replyCount);


}
