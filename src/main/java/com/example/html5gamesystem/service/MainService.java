package com.example.html5gamesystem.service;

import com.example.html5gamesystem.result.Result;
import org.springframework.stereotype.Service;

@Service
public class MainService {
    public Result ping(){
        return Result.ok();
    }
}
