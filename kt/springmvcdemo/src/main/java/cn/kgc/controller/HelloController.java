package cn.kgc.controller;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloController  extends AbstractController {
    @Override
    protected ModelAndView handleRequestInternal(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {
        //接收参数
        //调用业务层处理具体业务逻辑
        //返回ModelAndViews对象
        System.out.println("调用了HelloController类的handleRequestInternal方法");
        ModelAndView md = new ModelAndView();
        md.setViewName("welcome");//设置视图名称
        return md;
    }
}
