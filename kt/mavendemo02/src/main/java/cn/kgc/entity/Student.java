package cn.kgc.entity;

import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student {
    private Integer id;
    private Integer gradeId;
    private String studentName;
    private String gender;
    private Integer age;
    private String studentNum;
    private Grade grade;

}