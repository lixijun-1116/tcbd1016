package cn.kgc.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class StudentHobby {
    private Integer id;
    private Integer hobbyId;
    private Integer studentId;
    private List<Hobby> list;
}
