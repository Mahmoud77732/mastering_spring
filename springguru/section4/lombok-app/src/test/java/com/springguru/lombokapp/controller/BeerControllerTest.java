/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.springguru.lombokapp.controller;

import java.util.UUID;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 *
 * @author mahmoud
 */
@SpringBootTest
public class BeerControllerTest {
    
    @Autowired
    BeerController beerController;
    
    @Test
    void getBeerById(){
        System.out.println(beerController.getBeerById(UUID.randomUUID()));
    }
    
}
