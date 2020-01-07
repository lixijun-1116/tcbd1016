package cn.kgc.util;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PageUtil<T> {

    private Integer pageNo;
    private Integer pageSize;
    private Integer count;
    private Integer totalPageCount;
    private List<T> list;
}
