package com.example.demo.service;

import com.example.demo.pojo.MiaoshaUser;
import com.example.demo.pojo.OrderInfo;

import com.example.demo.vo.GoodsVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class MiaoshaService {

    @Autowired
    GoodsService goodsService;

    @Autowired
    OrderService orderService;

    @Transactional      //进行秒杀步骤：减库存 创建普通订单 创建秒杀订单    注意这是个事务操作
    public OrderInfo miaosha(MiaoshaUser user, GoodsVo goodsVo) {
        //减库存
        goodsService.reduceStock(goodsVo);
        //创建普通订单、创建秒杀订单  注意这是个事务操作
        return orderService.createOrder(user, goodsVo);
    }
}
