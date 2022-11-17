package com.adsh.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class RestfulController {
//    原来的http://localhost:8080/springMvc_04_controller_war_exploded/add?a=1&b=2
//    Restful风格：http://localhost:8080/springMvc_04_controller_war_exploded/add/1/2
    @RequestMapping(value = "/add/{a}/{b}", method = RequestMethod.GET)
//    @GetMapping("/add/{a}/{b}")
//    @DeleteMapping("/add/{a}/{b}")
    public String test(@PathVariable int a, @PathVariable int b, Model model){
        int res = a+b;
        model.addAttribute("msg", "get:a+b="+res);
        return "test1";
    }//    http://localhost:8080/springMvc_04_controller_war_exploded/add/1/2

    @PostMapping ("/add/{a}/{b}")
    public String test2(@PathVariable int a, @PathVariable int b, Model model){
        int res = a+b;
        model.addAttribute("msg", "post:a+b="+res);
        return "test1";
    }//http://localhost:8080/add/1/3
}

