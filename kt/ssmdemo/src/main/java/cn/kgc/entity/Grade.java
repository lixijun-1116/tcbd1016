package cn.kgc.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Grade {
    private Integer id;
    private String gradeName;
    private Date createDate;
    private String details;
}
