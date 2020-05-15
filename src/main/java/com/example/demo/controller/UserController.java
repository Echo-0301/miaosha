package com.example.demo.controller;

import com.example.demo.common.ServerResponse;
import com.example.demo.controller.base.BaseController;
import com.example.demo.pojo.User;
import com.example.demo.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;
import java.util.Map;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author oo
 * @since 2019-12-07
 */
@Controller
@RequestMapping("/manage/user")
public class UserController extends BaseController {

    @RequestMapping("/as")
    @ResponseBody
    public String ls(){
        System.out.println("jin");

        return "jin";
    }

//####1.后台管理员登录
    @RequestMapping(value="/login",method = RequestMethod.POST)
    @ResponseBody
    public ServerResponse<User> login(Model model, HttpSession session,
                                      @RequestBody Map<String, String> person
    ){
        System.out.println("/manage/user/login");
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
//    ####2.用户列表
//    @RequestMapping(value="/list",method = RequestMethod.GET)
//    @ResponseBody
//    public ServerResponse<PageInfo> orderList(HttpSession session, @RequestParam(value = "pageNum",defaultValue = "1") int pageNum,
//                                              @RequestParam(value = "pageSize",defaultValue = "10")int pageSize){
//
//    ServerResponse<PageInfo> response;
//    List<User> users = userServiceImpl.getAll();
////    User user = (User)session.getAttribute(Const.CURRENT_USER);
//    Integer role=(Integer) session.getAttribute("role");
//    System.out.println("user :"+role);
//
//    if(role!=null)
//    {
//        if(role==1)
//        {
//            PageInfo<User> pageInfo = new PageInfo<User>(users);
//            pageInfo.setPageNum(pageNum);
//            pageInfo.setPageSize(pageSize);
//
//            response = new ServerResponse<PageInfo>(0,pageInfo);
//        }
//        else {
//            response = new ServerResponse<PageInfo>(1,"没有权限");
//        }
//
//    }
//    else {
//        response = new ServerResponse<PageInfo>(10,"用户未登录,请登录");
//    }
//    return response;
//}

}
