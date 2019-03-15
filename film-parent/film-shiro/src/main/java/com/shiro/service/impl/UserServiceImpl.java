package com.shiro.service.impl;

import com.shiro.dao.UserDaoMapper;
import com.shiro.pojo.User;
import com.shiro.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import tk.mybatis.mapper.entity.Example;

import javax.jws.soap.SOAPBinding;

public class UserServiceImpl implements UserService {
    @Autowired
    private UserDaoMapper userDaoMapper;
    @Override
    public User findUserByName(String username) {

        Example example=new Example(User.class);
        Example.Criteria criteria=example.createCriteria();
        criteria.andEqualTo("username",username);
        User user= (User) userDaoMapper.selectByExample(example);
        return user;
    }


}
