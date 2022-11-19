package com.adsh.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/user")
public class LoginController {
    @RequestMapping("/login")
    public String login(HttpSession session, String username, String password, Model model){
        session.setAttribute("userLoginInfo",username);
        model.addAttribute("username",username);
        return "main";
    }
    @RequestMapping("/main")
    public String gomain(){

        return "main";
    }
    @RequestMapping("/gologin")
    public String gologin(){

        return "login";
    }
    @RequestMapping("/logout")
    public String logout(HttpSession session, String username, String password, Model model){
        session.removeAttribute("userLoginInfo");
        return "main";
    }
}
