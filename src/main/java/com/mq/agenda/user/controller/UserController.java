package com.mq.agenda.user.controller;

import com.mq.agenda.user.bean.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
//
//public class UserController {
//    @Autowired
//    UserService userService;
//
//    @GetMapping("/insertPage")
//    public String index(){
//        return "insertPage";
//    }
//
//    @GetMapping("select/{id}")
//    @ResponseBody
//    public String save(@PathVariable int id){
//        return userService.select(id).toString();
//    }
//
//    @GetMapping("/userList")
//    public String userList(Model model){
//        List<User> users = userService.userList();
//        model.addAllAttributes(users);
//        return "userList";
//    }
//
//    @GetMapping("/insert")
//    public String save(User user){
//        userService.save(user);
//        return "redirect:/userList";
//    }
//
//    @GetMapping("/delete/{id}")
//    public String delete(@PathVariable Integer id){
//        userService.delete(id);
//        return "redirect:/userList";
//    }
//
//    @GetMapping("/updatePage/{id}")
//    public String updatePage(Model model,@PathVariable int id){
//        User user = userService.findUserById(id);
//        model.addAttribute("user",user);
//        return "updatePage";
//    }
//
//    @PostMapping("/update")
//    public String updateUser(User user){
//        userService.update(user);
//        System.out.println("修改的用户为 ： " + user.getName());
//        return "redirect:/userList";
//    }
//}

