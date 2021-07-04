package com.mq.agenda.user.controller;

import com.mq.agenda.user.Service.AgenService;
import com.mq.agenda.user.bean.Agenda;
import com.mq.agenda.user.mapper.AgendaMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;
import java.util.List;


@Controller
public class AgendsController {

    //日程分类板块

    //日程板块
    @Autowired
    AgenService agenService;
    @Autowired
    AgendaMapper agendaMapper;

    @RequestMapping("/Toinsert")
    public String Toinsert(){
        return "from/create_agen";
    }
    @RequestMapping("/create_agen")
    public String create_agen(Model model,Agenda agenda){
        agenService.addAgen(agenda);
        System.out.println("插入数据成功");
        model.addAttribute("InsertOk","添加成功了！");
        return "html/index_contact";
    }
    //添加日程
//    @RequestMapping("select/{id}")
//    @ResponseBody
//    public String save(@PathVariable int id){
//        return agenService.fiId(id).toString();
//    }

    //添加
//    @RequestMapping("/insert")
//    public String save(Agenda agenda){
//        agendaService.save(agenda);
//        return "redirect:html/stration_agen";
//    }
    //删除日程
//    @RequestMapping("/xiugai/{id}")
//    public String updatePage(Agenda agenda,Model model,@PathVariable int id){
//        agenService.upagen(agenda);
//        model.addAttribute("agenda","修改成功");
//        return "html/index_contact";
//    }
    @RequestMapping("/Toxiugai")
    public String Toxiugai(){
        return "xiugai";
    }
@RequestMapping("/xiugai")
public String updatePage(Model model, HttpSession session, @PathVariable int id){
    Agenda agenda= agenService.findAgenById(id);
    List<Agenda> agenda1 = agenService.selectAllAgen();
    Agenda a = new Agenda();
    int s=0;
    s = (int) a.getId();
    session.setAttribute("luanz",s);
    model.addAttribute("agendax",agenda);
    return "xiugai";
}
@PostMapping("/update")
public String updateAgen(Agenda agenda){
        agenService.upagen(agenda);
        return "html/index_contact";
}
    @GetMapping("/delete")
    public String delete(@PathVariable Integer id){
        agendaMapper.deleteId(id);
        return "redirect:/html/index_contact";
    }
    @RequestMapping("/stration_agen")
    public String stration_agen(Model model){
        agenService.selectDate();
        List<Agenda> table = agenService.selectyear();
        model.addAttribute("table",table);
        return "html/stration_agen";
    }

}
