package cn.kgc.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Blog {
    private Integer id;
    private String content;
    private Date publishTime;
    private Integer userId;
}
