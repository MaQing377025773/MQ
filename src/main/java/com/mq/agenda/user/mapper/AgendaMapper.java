package com.mq.agenda.user.mapper;
import com.mq.agenda.user.bean.Agenda;
import com.mq.agenda.user.bean.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
@Mapper
public interface AgendaMapper {
    //查询所有日程
    List<Agenda> AllAgendaList();
    //更改日程信息
//    int update(Agenda agenda);
    //日期
    List<Agenda> selectdate();
    List<Agenda> selectmon();
    List<Agenda> selectyear();
//    List <Agenda> selectBydate();
    //根据id删除
    int deleteId(int id);
     int addAgen(Agenda agenda);
     int upagen(Agenda agenda);
     Agenda findAgenById(int id);
//     void seid(Agenda agenda);

}
