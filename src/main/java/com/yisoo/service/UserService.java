package com.yisoo.service;

import com.yisoo.bean.User;
import com.yisoo.bean.UserExample;
import com.yisoo.dao.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    UserMapper userMapper;
//    根据userid找结果
    public User getUserById(String userid){
        UserExample userExample = new UserExample();
        UserExample.Criteria criteria = userExample.createCriteria();
        criteria.andUserIdEqualTo(userid);
        List<User> users = userMapper.selectByExample(userExample);
        return users.get(0);
    }
    public User getUserByYisoo(Integer yisooid){
        return userMapper.selectByPrimaryKey(yisooid);
    }
//      根据YISOOID 更新
    public void updateUser(User user){
        userMapper.updateByPrimaryKeySelective(user);
    }
//    添加用户
    public void addUser(User user){
        userMapper.insert(user);
    }
}
