package com.example.demo.service.base;

import com.example.demo.dao.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BaseService {
//    @Autowired
//    public ProductMapper productMapper;
    @Autowired
    public UserMapper userMapper;
//    @Autowired
//    public OrderMapper orderMapper;
//    @Autowired
//    public CategoryMapper categoryMapper;
//    @Autowired
//    public ShippingMapper shippingMapper;
}
