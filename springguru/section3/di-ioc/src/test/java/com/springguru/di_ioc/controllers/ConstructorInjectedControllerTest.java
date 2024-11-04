/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
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
public class ConstructorInjectedControllerTest {
   
    @Autowired
    ConstructorInjectedController controller;
    
    @Test
    void sayHello(){
        System.out.println(controller.sayHello());
    }
    
}
