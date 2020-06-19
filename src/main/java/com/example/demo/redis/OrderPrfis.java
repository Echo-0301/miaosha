package com.example.demo.redis;

public class OrderPrfis extends BasePrefix{
    public OrderPrfis(int expireSeconds, String prefix) {
        super(expireSeconds, "order");
    }

    @Override
    public int expireSeconds() {
        return 60;
    }
}
