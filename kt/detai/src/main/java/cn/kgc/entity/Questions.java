package cn.kgc.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Questions {
    private Integer id;
    private String title;
    private String detailDesc;
    private Integer answerCount;
    private Date lastModified;

}
