package com.mq.agenda.user.mapper;
import com.mq.agenda.user.bean.Admin;
import com.mq.agenda.user.bean.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface UserMapper{
    //登录
    public User getInfo(@Param("useremail") String useremail,@Param("password") String password);
    List<User> selectAlluser();
//    public User selectemail(User user);
    //注册
    public int add(User user);
    public int updatepw(User user);
    public int modifyUser(User user);
}
