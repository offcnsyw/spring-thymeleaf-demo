package com.offcn.controller;

import com.offcn.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class FirstThymeleafController {

    @RequestMapping("/index")
    public String index(Model model){
        model.addAttribute("flag","yes");
        model.addAttribute("message","hello thymeleaf");
        User user = new User(1,"优就业",23);
        User user1 = new User(2,"优就业001",232);
        model.addAttribute("user",user);
        Map<String,Object> map = new HashMap<>();
        map.put("src1","1.jpg");
        map.put("src2","2.jpg");
        map.put("user",user1);
        model.addAttribute("src",map);
        return "index";
    }

    @RequestMapping("/findall")
    public String indexall(Model model){
        List<User> list = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            User user = new User(i+1,"优就业"+i,i*i);
            list.add(user);
        }
        model.addAttribute("users",list);
        return "index1";
    }
}
