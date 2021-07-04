package com.mq.agenda.user.controller;
import com.mq.agenda.user.Service.AgenService;
import com.mq.agenda.user.Service.UserService;
import com.mq.agenda.user.bean.Agenda;
import com.mq.agenda.user.bean.User;
import com.mq.agenda.user.mapper.AgendaMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Controller
public class IndexController {
    @Autowired
    AgenService agenService;
    @Resource
    AgendaMapper agendaMapper;
    @Autowired
    UserService userService;

   @RequestMapping("/index")
    public String indexPage(Model model){
       return "index";
   }
    @RequestMapping("/index_contact")
    public String index_contact(Model model ,HttpSession session){
//            Agenda agenda = new Agenda();
           List<Agenda> day = agenService.selectDate();
           model.addAttribute("day",day);
//        Date d = new Date();
//        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
//        System.out.println("格式化输出：" + sdf.format(d));
        List<Agenda> mon = agenService.selectMon();
        model.addAttribute("Mon",mon);
        List<Agenda> r = agenService.selectAllAgen();
        List<Agenda> year = agenService.selectyear();
            model.addAttribute("year",r);
        return "html/index_contact";
   }
   @RequestMapping("/updateUser")
    public String updateUser(Model model,User user){
       userService.modifyUser(user);
       model.addAttribute("msg","修改成功了！！");
       return "login";
   }



}

