package cn.kgc.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Hobby {
    private Integer id;
    private String hobbyName;
    private Date createTime;
    private StudentHobby studentHobby;
}
