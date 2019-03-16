package com.qhit.controller;

import com.qhit.pojo.User;
import com.qhit.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;



@Controller
public class Usercontroller {
    @Autowired
    private UserService service;

    @RequestMapping("login")
    public String login(User user) {
        User user1 = service.login(user);
        if (user1 != null) {
            return "adduser";
        } else {
            return "index";
        }
    }

    @RequestMapping("add")
    public String addUser(User user) {
        int row = service.addUser(user);
        if (row < 0) {
            return "adduser";
        } else {
            return "index";
        }
    }
}
