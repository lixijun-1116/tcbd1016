package cn.kgc.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * dept
 * @author 
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Dept {
    /**
     * 部门ID
     */
    private Integer id;

    /**
     * 部门名称
     */
    private String name;

    /**
     * 设立时间
     */
    private Date establishmentTime;

    /**
     * 撤销时间
     */
    private Date cancellationTime;

    /**
     * 部门状态 1撤销 2营业中
     */
    private Integer status;

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


}