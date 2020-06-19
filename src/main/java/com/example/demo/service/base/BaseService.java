package com.example.demo.service.base;

import com.example.demo.util.ServerResponse;

public interface BaseService<T> {

    public ServerResponse insert(T t);

    public ServerResponse delete(int id);

    public ServerResponse update(T t);

    public ServerResponse get(int id);

    public ServerResponse findAll();

    public int getCountById(int id);

    public ServerResponse getyName(String name);


}
