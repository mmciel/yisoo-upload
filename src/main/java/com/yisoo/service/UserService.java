package com.yisoo.service;

import com.yisoo.bean.User;
import com.yisoo.dao.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    UserMapper userMapper;
//    根据userid+password找结果
    public User getUserByIdAndPw(String userid, String password){
        return null;
    }
}
