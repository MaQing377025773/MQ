package com.mq.agenda.user.Service;

import com.mq.agenda.user.bean.Agenda;
import java.util.List;

public interface AgenService {
    public List<Agenda> selectAllAgen();
    public List<Agenda> selectDate();
    public List<Agenda> selectMon();
    public List<Agenda> selectyear();
    public int addAgen(Agenda agenda);
    public  int deleteId(int id);
    public Agenda findAgenById(int id);
    public int upagen(Agenda agenda);
//    public int seid(int id);
}
