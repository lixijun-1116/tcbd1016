package cn.kgc.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * emp
 * @author 
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Emp{
    /**
     * 员工ID
     */
    private Integer id;

    /**
     * 员工唯一标识符
     */
    private String uuid;

    /**
     * 曾用名
     */
    private String firstName;

    /**
     * 现用名
     */
    private String lastName;

    /**
     * 性别 1男 2女
     */
    private Integer gender;

    /**
     * 生日
     */
    private Date birthday;

    /**
     * 手机号
     */
    private String mobile;

    /**
     * 邮箱
     */
    private String mail;

    /**
     * 员工状态 1离职 2在职 3休假 4 请假 5退休
     */
    private Integer status;

    /**
     * 入职时间
     */
    private Date entryTime;

    /**
     * 离职时间
     */
    private Date departureTime;

    /**
     * 省份或者直辖市
     */
    private Integer province;

    /**
     * 城市
     */
    private Integer city;

    /**
     * 区县
     */
    private Integer district;

    /**
     * 详细地址
     */
    private String address;

    /**
     * 身份证号
     */
    private String idNumber;


}