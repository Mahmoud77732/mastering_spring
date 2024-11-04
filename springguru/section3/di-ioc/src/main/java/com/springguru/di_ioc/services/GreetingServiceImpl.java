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
@Service
public class GreetingServiceImpl implements GreetingService{

    @Override
    public String sayGreeting() {
        return "Hello from base service!!!";
    }
    
    
}
