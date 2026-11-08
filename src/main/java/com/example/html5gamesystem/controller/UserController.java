package com.example.html5gamesystem.controller;

import com.example.html5gamesystem.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/api/user")
public class UserController {
    /*
    * 使用api/user/regiser 用户用POST方法发送User类，服务接收并完成注册，然后放回Result类并将其中的message改为注册成功
    *  使用api/user/login 用户用POST方法发送User类，进行登录操作，进行账户密码比对，正确后返回Result类，message改为注册成功，如果账户密码不正确返回的Result类的code改为403，message返回账户或密码错误，如果账户不存在，返回的Result类，code改为404，message返回用户不存在
    *
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

}
