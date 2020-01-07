package cn.kgc.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


/**
 * login
 * @author 
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Login{
    /**
     * 登录主键ID
     */
    private Integer id;

    /**
     * 登录账号
     */
    private String account;



    /**
     * 登录密码
     */
    private String password;

    /**
     * 员工ID
     */
    private Integer eid;

    /**
     * 员工对象
     */
    private Emp emp;

    /**
     *
     */
    private Dept dept;
    private Edrelationship edrelationship;


}