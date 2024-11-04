/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.springguru.di_ioc.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

/**
 *
 * @author mahmoud
 */
@Service
@Primary
public class GreetingServicePrimary implements GreetingService{

    @Override
    public String sayGreeting() {
        return "Hello from the primary Bean!";
    }
    
    
}
