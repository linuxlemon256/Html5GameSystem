package com.example.html5gamesystem;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.example.html5gamesystem.mapper")
public class Html5GameSystemApplication {

    public static void main(String[] args) {
        SpringApplication.run(Html5GameSystemApplication.class, args);
    }

}
