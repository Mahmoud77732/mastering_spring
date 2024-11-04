/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.springguru.di_ioc.controllers;

import com.springguru.di_ioc.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

/**
 *
 * @author mahmoud
 */
@Controller
public class SetterInjectedController {
    
    private GreetingService greetingService;

    @Qualifier("setterGreetingBean")
    @Autowired
    public void setGreetingService(GreetingService greetingService) {
        this.greetingService = greetingService;
    }
    
    public String sayHello(){
        return greetingService.sayGreeting();
    }
    
}
