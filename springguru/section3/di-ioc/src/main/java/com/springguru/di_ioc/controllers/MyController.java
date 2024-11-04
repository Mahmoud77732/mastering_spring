/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.springguru.di_ioc.controllers;

import com.springguru.di_ioc.services.GreetingService;
import com.springguru.di_ioc.services.GreetingServiceImpl;
import org.springframework.stereotype.Controller;

/**
 *
 * @author mahmoud
 */
@Controller
public class MyController {
    
    private final GreetingService greetingService;

    public MyController() {
        this.greetingService = new GreetingServiceImpl();
    }
    
    public String sayHello(){
        System.out.println("I'm in MyController");
        
        return greetingService.sayGreeting();
    }
    
}
