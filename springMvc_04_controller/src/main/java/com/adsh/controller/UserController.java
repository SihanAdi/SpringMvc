package com.adsh.controller;

import com.adsh.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/user")
public class UserController {
    @RequestMapping("/t1")
    public String test(@RequestParam("name") String name, Model model){
        System.out.println("name:"+name);
        model.addAttribute("msg", name);
        return "test1";
    }
//    1．接收前端用户传递的参数，判断参数的名字，假设名字直接在方法上，可以直接使用
//2．假设传递的是一个对象User，匹配user对象中的字段名：如果名字一致则0K，否则，匹配不到
    @RequestMapping("/t2")
    public String test2(User user, Model model){
        System.out.println("user:"+user);
        model.addAttribute("msg", user);
        return "test1";
    }
}
