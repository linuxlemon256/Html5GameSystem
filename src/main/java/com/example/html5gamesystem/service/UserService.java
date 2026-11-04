package com.example.html5gamesystem.service;


import org.springframework.stereotype.Service;

@Service
public class UserService {
    private int a=0;
    private String b = "Hello World";
    public int ping() {
        return 200;
    }
    public int add() {
        a++;
        System.out.println(a);
        return a;
    }
    public String print() {
        System.out.println(b);
        return b;
    }

}
