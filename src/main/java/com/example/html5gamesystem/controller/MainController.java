package com.example.html5gamesystem.controller;

import com.example.html5gamesystem.result.Result;
import com.example.html5gamesystem.service.MainService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class MainController {
    private MainService mainService;
    public MainController(MainService mainService) {
        this.mainService = mainService;
    }


    @GetMapping("/ping")
    public Result ping() {
        return mainService.ping();
    }
}
