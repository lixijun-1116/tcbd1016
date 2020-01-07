package cn.kgc.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    //用户id
    private int id;
    //账号
    private String userName;
    //密码
    private String password ;
    //姓名
    private String nickName;

}
