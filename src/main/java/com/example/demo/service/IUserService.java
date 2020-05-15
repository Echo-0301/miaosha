package com.example.demo.service;

import com.example.demo.pojo.User;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author oo
 * @since 2019-12-07
 */
public interface IUserService {
    public User dologin(String username, String password);
    public List<User> getAll();
    public int countUser();
    Integer add(User user);
    public List<User> getAns(String username);


}

