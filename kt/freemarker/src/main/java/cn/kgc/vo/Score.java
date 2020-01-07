package cn.kgc.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Score {

    private Integer id;
    private String student_num;
    private String student_name;
    private String course_name;
    private double score;
}
