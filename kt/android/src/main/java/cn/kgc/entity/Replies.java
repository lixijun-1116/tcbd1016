package cn.kgc.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Replies {
    private Integer id;
    private String content;
    private Date replyTime;
    private Integer infoId;

}
