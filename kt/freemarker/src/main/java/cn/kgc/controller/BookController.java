package cn.kgc.controller;

import cn.kgc.entity.Book;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Controller
public class BookController {
    @RequestMapping("book")
    public String book(Model model){
        List<Book> list = new ArrayList<>();

        Book book1 = new Book();
        Date date = new Date();
        book1.setId(1);
        book1.setBookName("java框架知识");
        book1.setPrice(110);
        book1.setPublishDate(date);
        book1.setStatus(1);

        Book book2 = new Book();
        book2.setId(2);
        book2.setBookName("大数据知识");
        book2.setPrice(200);
        book2.setPublishDate(date);
        book2.setStatus(3);

        list.add(book1);
        list.add(book2);

        model.addAttribute("books",list);
        return "book_list";
    }
}
