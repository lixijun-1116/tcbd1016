package cn.kgc.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


/**
 * edrelationship
 * @author 
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Edrelationship{
    /**
     * 员工部门关系表ID
     */
    private Integer id;

    /**
     * 员工ID
     */
    private Integer eid;

    /**
     * 部门ID
     */
    private Integer did;



}