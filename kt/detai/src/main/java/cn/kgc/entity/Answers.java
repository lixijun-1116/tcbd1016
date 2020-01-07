package cn.kgc.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Answers {
    private Integer id;
    private String ansContent;
    private Date ansDate;
    private Integer qid;

}
