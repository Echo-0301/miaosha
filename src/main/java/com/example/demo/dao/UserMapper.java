package com.example.demo.dao;

import com.example.demo.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface UserMapper {
//    int insert(User record);
//
//    int insertSelective(User record);
    User dologin(@Param("username") String username, @Param("password") String password);
    List<User> getAll();
    public int countUser();
    public Integer add(User user);
    public List<User> getAns(@Param("username") String username);


}
