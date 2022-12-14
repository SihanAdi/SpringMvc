package com.adsh.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller //代表被spring接管，这个注解的类中，所有的方法，如果返回值是String，并且具有具体页面可以跳转，那么就会被视图解析器解析
public class ControllerTest2 {
    @RequestMapping("/t2")
    public String test1(Model model){
        model.addAttribute("msg", "ControllerTest2");
        return "test1";
    }
    @RequestMapping("/t1")
    public String test2(Model model){
        model.addAttribute("msg", "ControllerTest2");
        return "test1";
    }
}
