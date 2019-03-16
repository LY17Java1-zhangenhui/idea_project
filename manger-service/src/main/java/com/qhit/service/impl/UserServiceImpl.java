package com.qhit.service.impl;

import com.qhit.mappr.UserMappr;
import com.qhit.pojo.User;
import com.qhit.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMappr mappr;

    public User login(User user) {
        return mappr.login(user);
    }

    public int addUser(User user) {
        return mappr.add(user);
    }
}
