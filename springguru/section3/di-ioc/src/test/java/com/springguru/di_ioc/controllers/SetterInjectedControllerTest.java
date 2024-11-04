/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.springguru.di_ioc.controllers;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 *
 * @author mahmoud
 */
@SpringBootTest
public class SetterInjectedControllerTest {
    
    @Autowired
    SetterInjectedController setterInjectedController;
    
    @Test
    void sayHello(){
        System.out.println(setterInjectedController.sayHello());
    }
    
}
