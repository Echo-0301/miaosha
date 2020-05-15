package com.example.demo.controller;

import com.example.demo.common.ServerResponse;
import com.example.demo.controller.base.BaseController;
import com.example.demo.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.Map;

@Controller
@RequestMapping("/demo")
public class SampleController extends BaseController {


    @RequestMapping("/redis/get")
    @ResponseBody
    public ServerResponse<Long> login()
    {
        System.out.println("/redis/get");
        Long v1 = redisService.get("key1",Long.class);
        return new ServerResponse(200,v1);

    }
    @RequestMapping("/thymeleaf")
    public String thymeleaf(Model model)
    {
        model.addAttribute("name","oo");
        return "hello";

    }


}
