package cn.kgc.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Book {
    private Integer id;
    private String bookName;
    private Integer price;
    private Date publishDate;
    private Integer status;
}
