package cn.kgc.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Menu {
    private Integer id;
    private String menuName;
    private String menuUrl;
    private Integer parentId;
}
