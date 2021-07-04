package com.mq.agenda.user.Service;

import com.mq.agenda.user.bean.Agenda;
import com.mq.agenda.user.bean.User;
import com.mq.agenda.user.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public interface UserService {
    //登录时信息核对
   public User getInfo(String name, String password);
   //注册
   public int add(User user);
   //查询所有用户
    public List<User> userList();

//    //修改用户
    public int modifyUser(User user);
//

}
