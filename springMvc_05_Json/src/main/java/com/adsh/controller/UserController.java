package com.adsh.controller;

import com.adsh.pojo.User;
import com.adsh.utils.JsonUtils;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

//@Controller
@RestController//它就不会走视图解析器，会直接返回一个字符串
public class UserController {
    @RequestMapping("/j1")
//produces:指定响应体返回类型和编码
//    @RequestMapping(value = "/j1",produces = "application/json;charset=utf-8")
//    @ResponseBody//它就不会走视图解析器，会直接返回一个字符串
    public String json() throws JsonProcessingException {
        //创建一个jackson的对象映射器，用来解析数据
        ObjectMapper objectMapper = new ObjectMapper();
        User user = new User("adsh", 4, "男");
        String s = objectMapper.writeValueAsString(user);
        return s;
    }
    @RequestMapping("/j2")
    public String json2() throws JsonProcessingException {
        List<User> list = new ArrayList<>();
        User user = new User("adsh", 4, "男");
        User user2 = new User("adsh2", 4, "男");
        User user3 = new User("adsh3", 4, "男");
        User user4 = new User("adsh4", 4, "男");

        list.add(user);
        list.add(user2);
        list.add(user3);
        list.add(user4);


        return JsonUtils.getJson(list);
    }
    @RequestMapping("/j3")
    public String json3() throws JsonProcessingException {

        Date date = new Date();

        return JsonUtils.getJson(date,"yyyy-MM-dd HH:mm:ss");
    }
}
