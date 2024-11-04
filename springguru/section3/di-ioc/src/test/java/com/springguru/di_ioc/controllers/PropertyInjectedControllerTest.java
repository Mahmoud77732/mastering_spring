/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.springguru.di_ioc.controllers;

import com.springguru.di_ioc.services.GreetingService;
import com.springguru.di_ioc.services.GreetingServiceImpl;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 *
 * @author mahmoud
 */
@SpringBootTest
public class PropertyInjectedControllerTest {
    
    @Autowired
    PropertyInjectedController propertyInjectedController;
    
//    @BeforeEach
//    public void setUp() {
//        propertyInjectedController = new PropertyInjectedController();
//        propertyInjectedController.greetingService = new GreetingServiceImpl();
//    }
    
    @Test
    void sayHello(){
        System.out.println(propertyInjectedController.sayHello());
    }
    
}
