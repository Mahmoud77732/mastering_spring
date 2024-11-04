/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.springguru.di_ioc.services.i18n;

import com.springguru.di_ioc.services.GreetingService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

/**
 *
 * @author mahmoud
 */
@Service("i18NService")
@Profile("ES")
public class SpanishGreetingService implements GreetingService {
    
    @Override
    public String sayGreeting(){
        return "Hola Mundo - ES!!";
    }
    
}
