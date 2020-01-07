package cn.kgc.controller;

import cn.kgc.entity.Product;
import cn.kgc.service.ProductService;
import com.alibaba.fastjson.JSON;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("product")
public class ProductController {
    @Autowired
    private ProductService productService;

    @RequestMapping("toSelect")
    public String toSelect(Model model){
        List<Product> list = productService.selectAllProductName();
        if (list != null && list.size() > 0){
            model.addAttribute("productNameList",list);
        }
        return "insert";
    }
    @RequestMapping("toSelect1")
    public String toSelect1(Model model){
        List<Product> list = productService.selectAllProductName();
        if (list != null && list.size() > 0){
            model.addAttribute("productList",list);
        }
        return "queryProduct";
    }
    @ResponseBody
    @RequestMapping(value = "query",method = RequestMethod.POST,produces = {"application/json;charset=UTF-8"})
    public String query(Integer  id, Map<String,String> map){
        System.out.println(id);
        //Integer uid = Integer.parseInt(id);
        Product product  = productService.selectAll(id);
        map.put("msg","该商品的库存数量是："+product.getQuantity());
        String json = JSON.toJSONString(map);
        return json;
    }
}
