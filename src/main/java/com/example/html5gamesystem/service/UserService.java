package com.example.html5gamesystem.service;


import com.example.html5gamesystem.mapper.UserMapper;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    private UserMapper userMapper;
    public void setUserMapper(UserMapper userMapper) {
        this.userMapper = userMapper;
    }
    public int ping() {
        return 200;
    }
}
