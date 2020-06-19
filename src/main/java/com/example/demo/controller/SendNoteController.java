package com.example.demo.controller;

import com.example.demo.redis.RedisService;
import com.example.demo.redis.UserKey;
import com.example.demo.result.Result;
import com.example.demo.service.MiaoshaUserService;
import com.example.demo.util.SendNoteUtil;
import com.example.demo.vo.LoginVo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Controller
@RequestMapping(value = "/api/note")
public class SendNoteController {

    @Autowired
    private SendNoteUtil sendNoteUtil;

    @Autowired
    private RedisService redisService;

    @Autowired
    MiaoshaUserService miaoshaUserService;

    private static Logger log = LoggerFactory.getLogger(LoginController.class);


    @RequestMapping("/phonelogin")
    public String toPhoneLogin() {
        return "phonelogin";
    }

    @RequestMapping(value = "/sendNote",method = RequestMethod.POST)
    @ResponseBody
    public void sendNote(String phone, HttpServletResponse response){
        System.out.println(phone);
        String template = "SMS_191485401";//模板code
        try {
            response.getWriter().write(sendNoteUtil.sendNoteMessgae(phone,template));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @RequestMapping(value = "/login",method = RequestMethod.POST)
    @ResponseBody
    public Result<Boolean> login(HttpServletResponse response,String phone,String authCode){
        //验证验证码
        if(!verifyAuthCode(authCode,phone)){
            return Result.success(false);
        }
        LoginVo loginVo = new LoginVo();
        loginVo.setMobile(phone);
        log.info(loginVo.toString());
        //登录
        miaoshaUserService.login(response, loginVo);

        return Result.success(true);
    }

    //对输入的验证码进行校验
    private boolean verifyAuthCode(String authCode, String telephone){
        if(StringUtils.isEmpty(authCode)){
            return false;
        }
        UserKey userKey = new UserKey("oo");
        String realAuthCode = redisService.get(userKey,telephone,String.class);
        return authCode.equals(realAuthCode);
    }
}

