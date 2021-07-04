package com.mq.agenda.user.controller;
import com.mq.agenda.user.Service.UserService;
import com.mq.agenda.user.bean.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller
public class LoginController {
    @Autowired
    UserService userService;
//    @Autowired
//    BCryptPasswordEncoder encoder;


    //欢迎也
    @GetMapping(value = {"/"})
    public String loginpage() {
        return "login";
    }
    @RequestMapping("Tologin")
    public String Tologin(){
        return "login";
    }
    @PostMapping("/login")
    public String login(HttpServletRequest request, User u, HttpSession session,Model model){
        String useremail = request.getParameter("useremail");
        String username = request.getParameter("username");
        String password  = request.getParameter("password");
        u=userService.getInfo(useremail,password);
        if(u!=null){
            session.setAttribute("loginuser",u);
            return "redirect:/index";
        }else{
            model.addAttribute("msg","账号密码错误？");
            return "login";
        }
    }
    @RequestMapping("/toRegister")
    public String toRegister() {
        return "register";
    }

    @PostMapping("/register")
    public String toRegisterSuccess(Model model,User user) {
        //添加一条记录到数据库中
        userService.add(user);
        System.out.println("插入数据成功");
        model.addAttribute("msg","注册成功了！");
        return "login";
    }
    @RequestMapping("Toadminlogin")
    public String Toadminlogin(){
        return "adminlogin";
    }

    @RequestMapping("/adminlogin")
    public String adminlogin(){

        return "adminlogin";
    }
    @RequestMapping("/Toadminregister")
    public String Toadminregister(){
        return "adminregister";
    }
    @RequestMapping("/adminregister")
    public String adminregister(){
        return "adminregister";
    }
    @RequestMapping("/loginout")
    public String loginout(){
        return "login";
    }
}


