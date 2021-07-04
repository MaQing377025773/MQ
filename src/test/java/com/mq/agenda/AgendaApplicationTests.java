package com.mq.agenda;
import com.mq.agenda.user.Service.AgenService;
import com.mq.agenda.user.bean.Agenda;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AgendaApplicationTests {


    @Autowired
    AgenService agenService;
    @Test
    public void selectAgenda(){
//        Date d = new Date();
//
//        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
//
//        System.out.println("格式化输出：" + sdf.format(d));
//        Calendar cal = Calendar.getInstance();
//        cal.setTimeInMillis( System.currentTimeMillis());
//        int month = cal.get(Calendar.MONTH) + 1; //
        List<Agenda> agenda = agenService.selectDate();
        System.out.println("日"+agenda);
        List<Agenda> agendamon=agenService.selectMon();
        System.out.println("月"+agendamon);
        List<Agenda> agendayear=agenService.selectyear();
        System.out.println("年"+agendayear);



    }


}
