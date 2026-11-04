package com.example.html5gamesystem.controller;

import com.example.html5gamesystem.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/api/user")
public class UserController {
    /*
    * 使用GET方法 /api/ping 返回200
    *  使用GET /api/add 系统使一个变量+1并输出
    *
    */
    private UserService userService;
    public UserController(UserService userService) {
        this.userService = userService;
    }
    @GetMapping("/ping")
    public int ping() {
        return userService.ping();
    }

    @GetMapping("/add")
    public int add() {
        return userService.add();
    }
    @GetMapping("/print")
    public String print() {
        return userService.print();
    }



}
