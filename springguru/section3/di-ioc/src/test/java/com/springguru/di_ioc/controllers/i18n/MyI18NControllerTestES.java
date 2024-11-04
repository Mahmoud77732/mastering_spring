/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.springguru.di_ioc.controllers.i18n;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

/**
 *
 * @author mahmoud
 */
@SpringBootTest
@ActiveProfiles("ES")
public class MyI18NControllerTestES {
    
    @Autowired
    MyI18NController myI18NController;
    
    @Test
    void sayHello(){
        System.out.println(myI18NController.sayHello());
    }
    
}
