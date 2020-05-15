package com.example.demo.controller.base;

import com.example.demo.redis.RedisService;
import com.example.demo.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class BaseController {
    @Autowired
    public IUserService userServiceImpl;
    @Autowired
    public RedisService redisService;
//    @Autowired
//    public IProductService productServiceImpl;
//    @Autowired
//    public IOrderService orderServiceImpl;
//    @Autowired
//    public ICategoryService categoryServiceImpl;
//    @Autowired
//    public IShippingService shippingServiceImpl;


}
