package com.springboot.spring_actuator.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunController {
    
    @Value("${myemail}")
    private String email;
    
    @Value("${myteam}")
    private String team;

    @RequestMapping("/")
    public String sayHello(){
        return "hello mahmoud";
    }

    @RequestMapping("/task")
    public String getTask(){
        return "Run a 5k!";
    }
    
    @GetMapping("/details")
    public String getDetails(){
        return "email: " + email + "<br>team: " + team;
    }


}
