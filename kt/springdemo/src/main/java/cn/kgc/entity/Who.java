package cn.kgc.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Who {
    private String name;

    public void print(){
        System.out.println("name:" + name);
    }

}
