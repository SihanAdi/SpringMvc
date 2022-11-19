package com.adsh.controller;

import com.adsh.pojo.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/ajax")
public class AjaxController {
    @RequestMapping("/t1")
    public String test(){
        return "hello";
    }
    @RequestMapping("/a1")
    public void a1(String name, HttpServletResponse response) throws IOException {

        System.out.println(name);
        if ("adsh".equals(name)){
            response.getWriter().print("true");
        }else {
            response.getWriter().print("false");
        }
    }
    @RequestMapping("/a2")
    public List<User> a2(){
        ArrayList<User> users = new ArrayList<>();
        users.add(new User("ad1号",3,"男"));
        users.add(new User("ad2号",3,"男"));
        users.add(new User("ad3号",3,"男"));
        return users;
    }
    @RequestMapping("/a3")
    public String a3(String name, String pwd){
        String msg = "";
        if (name!=null){
            if ("admin".equals(name)){
                msg = "ok";
            }else {
                msg = "wrong";
            }
        }
        if (pwd!=null){
            if ("123456".equals(pwd)){
                msg = "ok";
            }else {
                msg = "wrong";
            }
        }
        return msg;
    }
}
