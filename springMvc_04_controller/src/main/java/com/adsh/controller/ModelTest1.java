package com.adsh.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@Controller
public class ModelTest1 {
//    @RequestMapping("/m1/t1")
//    public String test1(HttpServletRequest request, HttpServletResponse response){
//        HttpSession session = request.getSession();
//        System.out.println(session.getId());
//        return "test1";
//    }
    @RequestMapping("/m1/t1")
    public String test1(Model model){
        model.addAttribute("msg", "ModelTest1");
//        return "forward:/WEB-INF/jsp/test1.jsp";//转发
        return "redirect:/index.jsp";//重定向
    }
}
