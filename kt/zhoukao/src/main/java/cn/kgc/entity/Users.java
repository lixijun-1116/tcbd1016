package cn.kgc.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class Users {
    private Integer id;
    private String userName;
    private String password;
    private Integer age;
    private Integer sex;
    private  String nickName;
    private String mobile;
    private String address;
    private Integer supper;
    private String picpath;
}
