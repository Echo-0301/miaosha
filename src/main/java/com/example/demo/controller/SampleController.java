package com.example.demo.controller;

import com.example.demo.common.ServerResponse;
import com.example.demo.controller.base.BaseController;
import com.example.demo.pojo.User;
import com.example.demo.redis.KeyPrefix;
import com.example.demo.redis.UserKey;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.util.Map;

@Controller
@RequestMapping("/demo")
public class SampleController extends BaseController {


//    @RequestMapping("/redis/get")
//    @ResponseBody
//    public ServerResponse<Long> RedisGet()
//    {
//        System.out.println("/redis/get");
//        Long v1 = redisService.get("key1",Long.class);
//        return new ServerResponse(200,v1);
//
//    }
//    @GetMapping("/query/{key}")
//    public ServerResponse<Long> RedisGetById(@PathVariable("key") String key)
//    {
//        System.out.println("/redis/get");
//        Long v1 = redisService.get(key,Long.class);
//        return new ServerResponse(200,v1);
//
//    }
//    @RequestMapping("/redis/set")
//    @ResponseBody
//    public ServerResponse<Long> RedisSet()
//    {
//        System.out.println("/redis/set");
//        Boolean res = redisService.set(UserKey.getById,""+1,"key2 set");
//        String v1 = redisService.get("key2",String.class);
//
//        if(res)
//            return new ServerResponse(200,v1);
//        else
//            return new ServerResponse(500,"fail");
//
//    }
    @RequestMapping("/thymeleaf")
    public String thymeleaf(Model model)
    {
        model.addAttribute("name","oo");
        return "hello";

    }


}
