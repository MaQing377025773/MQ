package com.mq.agenda.user.Impl;

import com.mq.agenda.user.Service.AgenService;
import com.mq.agenda.user.bean.Agenda;
import com.mq.agenda.user.mapper.AgendaMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
public class AgenServiceImpl implements AgenService {
    @Autowired
    AgendaMapper agendaMapper;

    @Override
    public List<Agenda> selectAllAgen(){
        return agendaMapper.AllAgendaList();
    }

    @Override
        public List<Agenda> selectDate(){

        return agendaMapper.selectdate();
    }
    @Override
        public List<Agenda> selectMon(){
        return agendaMapper.selectmon();
    }
    @Override
        public List<Agenda> selectyear(){
        return agendaMapper.selectyear();
    }
    @Override
        public int addAgen(Agenda agenda){
        return agendaMapper.addAgen(agenda);
    }
    @Override
        public int deleteId(int id){
        return agendaMapper.deleteId(id);
    }
    @Override
        public int upagen(Agenda agenda){
        return agendaMapper.upagen(agenda);
    }
    @Override
        public Agenda findAgenById(int id){
        return agendaMapper.findAgenById(id);
    }
}
