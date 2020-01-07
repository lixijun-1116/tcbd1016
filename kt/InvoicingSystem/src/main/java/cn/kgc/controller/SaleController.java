package cn.kgc.controller;

import cn.kgc.entity.Sale;
import cn.kgc.entity.Users;
import cn.kgc.service.SaleService;
import cn.kgc.util.Common;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpSession;
import javax.xml.crypto.Data;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

@Controller
@RequestMapping("sale")
public class SaleController {
    @Autowired
    private SaleService saleService;

    @RequestMapping("toInsert")
    public String toInsert(){
        return "insert";
    }

    @RequestMapping(value = "insert",method = RequestMethod.POST,produces = {"application/json;charset=UTF-8"})
    public String insert(Sale sale, HttpSession session, Model model){
        System.out.println("wolaile");
        System.out.println(sale.getPrice());
        System.out.println(sale.getQuantity());
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        Date date = new Date();
        String format1 = format.format(date);
        try {
            Date date1 = format.parse(format1);
            sale.setSaleDate(date1);
            Double totalPrice = sale.getPrice() * sale.getQuantity();
            sale.setTotalPrice(totalPrice);
            Users users =(Users) session.getAttribute(Common.LOGIN_USER);
            sale.setUserId(users.getId());
            Integer count = saleService.insertSale(sale);
            if (count > 0){
                System.out.println("添加成功");
                model.addAttribute("msg","添加成功");
            }else{
                System.out.println("添加失败");
                model.addAttribute("msg","添加失败");
            }
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return "insert";
    }

    @RequestMapping(value = "queryAll")
    public String queryAll(Integer pageNo, Integer pageSize,Model model){
        if (pageNo == null){
            pageNo =1;
        }
        if (pageSize == null){
            pageSize = 5;
        }
        PageInfo<Sale> pageInfo = saleService.queryAll(pageNo, pageSize);
        if (pageInfo.getList() != null || pageInfo.getList().size() >0){
            model.addAttribute("pageInfo",pageInfo);
            return "queryAll";
        }else{
            model.addAttribute("msg","无数据");
            return "queryAll";
        }
    }
}
