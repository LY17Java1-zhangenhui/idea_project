package com.qhit.service;

import com.qhit.pojo.User;


public interface UserService {
    int  addUser(User user);
    User  login(User user);
}
