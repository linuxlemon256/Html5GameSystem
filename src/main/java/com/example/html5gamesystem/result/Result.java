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
    public Result(){

    }

    public int getCode() {
        return code;
    }
    public void setCode(int code) {
        this.code = code;
    }
    public String getMessage() {
        return message;
    }
    public void setMessage(String message) {
        this.message = message;
    }
    public Object getData() {
        return data;
    }
    public void setData(Object data) {
        this.data = data;
    }
    public LocalDateTime getTimestamp() {
        return timestamp;
    }
    public void setTimestamp(LocalDateTime timestamp) {
        this.timestamp = timestamp;
    }

    public static Result ok(){
        return new Result(200,"ok",null,LocalDateTime.now());
    }
}
