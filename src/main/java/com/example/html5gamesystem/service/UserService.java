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

    public UserService(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    public Result ping() {
        return Result.ok();
    }

    public Result register(User user) {
        int row = userMapper.addUser(user.getName(),user.getPassword());
        if(row>0){
            return Result.ok("注册成功");
        }else {
            return Result.fail(500,"注册失败");
        }
    }
    public Result login(@RequestBody User user) {
        String inputName = user.getName();
        if (userMapper.getUserByName(inputName) == 0){
            return Result.fail(404,"账户不存在");
        }
        String inputPassword = user.getPassword();
        String password = userMapper.getPassword(inputName);
        if (password.equals(inputPassword)) {
            return Result.ok("登录成功");
        }else{
            return Result.fail(403,"账户或密码错误");
        }
    }
}