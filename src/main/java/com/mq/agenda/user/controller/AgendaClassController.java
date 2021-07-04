package com.mq.agenda.user.controller;

import com.mq.agenda.user.Service.AgenService;
import com.mq.agenda.user.bean.Agenda;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.List;

public class AgendaClassController {
    @Resource
    AgenService agenService;
    @RequestMapping("/stration_agen_class")
    public String stration_agen_class(Model model, HttpSession session){
        List<Agenda> agenda = agenService.selectAllAgen();
        model.addAttribute("agencla",agenda);
        session.setAttribute("agenss",agenda);
        return "html/stration_agen_class";
    }
}
