package com.example.html5gamesystem.controller;

import com.example.html5gamesystem.result.Result;
import com.example.html5gamesystem.service.MainService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class MainController {
    private MainService mainService;
    public MainController(MainService mainService) {
        this.mainService = mainService;
    }


    @GetMapping("/ping/{code}")
    public Result ping(@PathVariable int code) {
        System.out.println("code:" + code);
        return mainService.ping();
    }
    @PostMapping("/ping")
    public Result ping(@RequestBody Result result) {
        System.out.println("result.message:" + result.getMessage());
        return mainService.ping();
    }
}
