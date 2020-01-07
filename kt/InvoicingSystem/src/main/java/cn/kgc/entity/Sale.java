package cn.kgc.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Sale {
    private Integer id;
    private Double price;
    private Integer quantity;
    private Double totalPrice;
    private Date saleDate;
    private Integer userId;
    private Integer productId;
    private Users users;
    private Product product;
}
