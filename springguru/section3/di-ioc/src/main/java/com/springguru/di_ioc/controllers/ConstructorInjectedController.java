/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.springguru.di_ioc.controllers;

import com.springguru.di_ioc.services.GreetingService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

/**
 *
 * @author mahmoud
 */
@Controller
public class ConstructorInjectedController {
    
    
    private final GreetingService greetingService;

    public ConstructorInjectedController(@Qualifier("greetingServiceImpl") GreetingService greetingService) {
        this.greetingService = greetingService;
    }
    
    public String sayHello(){
        return greetingService.sayGreeting();
    }
}
