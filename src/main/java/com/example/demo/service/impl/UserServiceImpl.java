package com.example.demo.service.impl;

import com.example.demo.dao.UserMapper;
import com.example.demo.pojo.User;
import com.example.demo.service.IUserService;
import com.example.demo.service.base.BaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author oo
 * @since 2019-12-07
 */
@Service
public class UserServiceImpl  extends BaseService implements IUserService {

    @Override
    public User dologin(String username, String password) {
        System.out.println("UserServiceImpl");
        User user =  userMapper.dologin(username,password);
        //System.out.println("userMapper "+user.getPassword());
        System.out.println("user "+user);
//

        return user;
    }

    @Override
    public List<User> getAll() {
        return userMapper.getAll();
    }

    @Override
    public int countUser() {
        return userMapper.countUser();

    }

    @Override
    public Integer add(User user) {
        return userMapper.add(user);
    }

    @Override
    public List<User> getAns(String username) {
        return userMapper.getAns(username);
    }
}

