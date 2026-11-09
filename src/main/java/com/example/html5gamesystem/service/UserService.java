package com.example.html5gamesystem.service;


import com.example.html5gamesystem.entity.User;
import com.example.html5gamesystem.mapper.UserMapper;
import com.example.html5gamesystem.result.Result;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.time.LocalDateTime;

@Service
public class UserService {
    private UserMapper userMapper;

    public void setUserMapper(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    public int ping() {
        return 200;
    }

    public Result register(User user) {
        return new Result(200, "注册成功", null, LocalDateTime.now());
    }
    public Result login(@RequestBody User user) {
        String Name=user.getName();


    }
}