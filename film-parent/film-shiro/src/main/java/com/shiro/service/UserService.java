package com.shiro.service;

import com.shiro.pojo.User;
import org.springframework.stereotype.Service;

@Service
public interface UserService {

    User findUserByName(String username);



}
