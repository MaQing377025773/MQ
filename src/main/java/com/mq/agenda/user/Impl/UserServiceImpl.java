package com.mq.agenda.user.Impl;

import com.mq.agenda.user.Service.UserService;
import com.mq.agenda.user.bean.Agenda;
import com.mq.agenda.user.bean.User;
import com.mq.agenda.user.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("UserService")
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;
    @Autowired
    private BCryptPasswordEncoder encoder;
    @Override
     public User getInfo(String useremail,String password){

        return userMapper.getInfo(useremail,password);
}
//
    @Override
    public int add(User user) {
//        String encode = encoder.encode(user.getPassword());
//        user.setPassword(encode);
//        userMapper.add(user);
    return userMapper.add(user);
    }
    @Override
    public List<User> userList(){
        return userMapper.selectAlluser();
    }
    @Override
    public int modifyUser(User user){
        return userMapper.modifyUser(user);
    }
    }


