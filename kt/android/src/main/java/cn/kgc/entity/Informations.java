package cn.kgc.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Informations {

    private Integer id;
    private String title;
    private String content;
    private Integer replyCount;
    private Integer viewCount;
    private Date reportTime;
    private Date lastPostTime;
    private List<Replies> repliesList;

}
