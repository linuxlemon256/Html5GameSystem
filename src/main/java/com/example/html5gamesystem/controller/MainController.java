package com.example.html5gamesystem.controller;

import com.example.html5gamesystem.result.Result;
import com.example.html5gamesystem.service.MainServer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class MainController {
    private MainServer mainServer;
    public MainController(MainServer mainServer) {
        this.mainServer = mainServer;
    }


    @GetMapping("/ping")
    public Result ping() {
        return mainServer.ping();
    }
}
