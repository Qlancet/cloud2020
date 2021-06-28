package com.czbank;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
@MapperScan("com.czbank.mapper")
public class App_plus_8005 {
    public static void main(String[] args) {
        SpringApplication.run(App_plus_8005.class);
    }
}
