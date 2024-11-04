/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.springguru.di_ioc.services;

import org.springframework.stereotype.Service;

/**
 *
 * @author mahmoud
 */
@Service("propertyGreetingService")
public class GreetingServicePropertyInjected implements GreetingService{

    @Override
    public String sayGreeting() {
        return "Friends don't let friends to property injection!!!";
    }
    
    
}
