package com.example.html5gamesystem.result;


import java.time.LocalDateTime;

public class Result {
    private int code;
    private String message;
    private Object data;
    private LocalDateTime timestamp = LocalDateTime.now();
    public Result(int code, String message, Object data, LocalDateTime timestamp) {
        this.code = code;
        this.message = message;
        this.data = data;
        this.timestamp = timestamp;
    }
    public Result(){}

    public static Result ok(){
        return new Result(200,"ok",null,LocalDateTime.now());
    }
}
