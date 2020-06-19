package com.example.demo.redis;


public interface GoodsPrefix {

    public int expireSeconds();

    public String getPrefix();

}