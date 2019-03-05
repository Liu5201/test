package com.user.controller;

import com.user.entity.User;
import com.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.Map;

@Controller
@ResponseBody
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping(value = "aaa.s")
    public String getUser(String uname,String upassword,Map map, HttpSession session){
        map.put("uname",uname);
        map.put("upassword",upassword);
        User user = userService.getUser(map);
       if (user!=null){
           session.setAttribute("user",user);
           return "login.jsp";
       }
        return "index.jsp";
    }

    @RequestMapping(value = "bbb.s")
    @ResponseBody
    public String getdasd(){
        System.out.println("Dasdasd");
        return "Dasdasdas";
    }

}
