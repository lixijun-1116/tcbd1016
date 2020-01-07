package cn.kgc.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * pcd
 * @author 
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Pcd{
    /**
     * 地区代码
     */
    private Integer id;

    /**
     * 当前地区的上一级地区代码
     */
    private Integer pid;

    /**
     * 地区名称
     */
    private String name;


}