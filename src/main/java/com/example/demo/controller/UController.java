package com.example.demo.controller;

import com.example.demo.common.ServerResponse;
import com.example.demo.controller.base.BaseController;
import com.example.demo.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/user")
public class UController extends BaseController {
//    ####1.登录
    @RequestMapping(value="/login",method = RequestMethod.POST)
    @ResponseBody
    public ServerResponse<User> login(Model model, HttpSession session,
                                      @RequestBody Map<String, String> person
    ){
        System.out.println("user/login");
        String username  = person.get("username");
        String password  = person.get("password");
        System.out.println("password : "+password);

        User user = userServiceImpl.dologin(username,password);
        ServerResponse<User> response;
        if(user!=null)
        {
            System.out.println("getUser: "+user.getPassword());
            session.setAttribute("role",user.getRole());
            model.addAttribute("user",user);
            model.addAttribute("status",0);
            response = new ServerResponse<User>(0,(User)user);
            System.out.println("response : "+response.getData());

        }
        else {
            model.addAttribute("status",1);
            model.addAttribute("msg","密码错误");
            response = new ServerResponse<User>(1,"密码错误");
            System.out.println("response : "+response.getMsg());

        }
        return response;
    }
//####2.注册 /user/register.do
    @RequestMapping(value="/register",method = RequestMethod.POST)
    @ResponseBody
    public ServerResponse<User> register(Model model, HttpSession session,
                                         @RequestBody Map<String, String> person
    ){
        System.out.println("user/register");
        String username  = person.get("username");
        String password  = person.get("password");
        String email  = person.get("email");
        String phone  = person.get("phone");
        String question  = person.get("question");
        String answer  = person.get("answer");
        User u = new User();
        u.setAnswer(answer);
        u.setQuestion(question);
        u.setPhone(phone);
        u.setEmail(email);
        u.setPassword(password);
        u.setUsername(username);
        System.out.println("INSERT START");

        Integer res = userServiceImpl.add(u);
        System.out.println("INSERT END");
        ServerResponse<User> response;
        if(res!=null&&res!=0)
        {

            model.addAttribute("user",u);
            model.addAttribute("status",0);
            response = new ServerResponse<User>(0,(User)u);
            response.setMsg("注册成功");
            System.out.println("response : "+response.getData());

        }
        else {
            model.addAttribute("status",1);
            model.addAttribute("msg","密码错误");
            response = new ServerResponse<User>(1,"用户已存在");
            System.out.println("response : "+response.getMsg());

        }
        return response;
    }
//    ####5.忘记密码 /user/forget_get_question.do
    @RequestMapping(value="/forget_get_question",method = RequestMethod.POST)
    @ResponseBody
    public ServerResponse<User> forget_get_question(Model model, HttpSession session,
                                                    @RequestBody Map<String, String> person
    ) {
        ServerResponse<User> response;
        System.out.println("user/forget_get_question");
        String username  = person.get("username");
        List<User> ans = userServiceImpl.getAns(username);
        if(ans==null){
            response = new ServerResponse(1,"该用户未设置找回密码问题");
        }else{
            User user = ans.get(0);
            System.out.println(user.getAnswer());
            response = new ServerResponse(1,user.getQuestion());

        }
        return response;

    }
    //    ####5.忘记密码 /user/forget_get_question.do
    @RequestMapping(value="/forget_check_answer",method = RequestMethod.GET)
    @ResponseBody
    public ServerResponse<User> forget_check_answer(Model model, HttpSession session,
                                                    @RequestParam(value = "answer") String answer,
                                                    @RequestParam(value = "question") String question,
                                                    @RequestParam(value = "username")String username
    ) {
        ServerResponse<User> response;
        System.out.println("user/forget_get_question");

        List<User> ans = userServiceImpl.getAns(username);
        System.out.println("answer:"+answer);
        User user = ans.get(0);
        String answ = user.getAnswer();
        System.out.println("answ:"+answ);

        if(answ.equals(answer)){
            response = new ServerResponse(1,"问题答案错误");
        }else{

            response = new ServerResponse(1,"问题答案正确");

        }
        return response;

    }


}
