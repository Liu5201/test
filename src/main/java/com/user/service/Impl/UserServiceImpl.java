package com.user.service.Impl;

import com.user.dao.UserMapper;
import com.user.entity.User;
import com.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;
@Service(value = "userService")
public class  UserServiceImpl  implements UserService {
    @Autowired
    private UserMapper userMapper;
    @Override
    public User getUser(Map map) {
        return userMapper.getUser(map);
    }
}
