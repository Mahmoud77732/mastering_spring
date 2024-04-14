package com.springboot.sbootstart.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunController {

    @GetMapping("/")
    public String sayHello(){
        return "Hello Spring Boot!";
    }

    @GetMapping("/task")
    public String getDailyTask(){
        return "Swim a 5k as a warm up!";
    }


    @GetMapping("value= /fortune")
    public String getDailyFortune() {
        return "Today is your lucky day.";
    }

}
