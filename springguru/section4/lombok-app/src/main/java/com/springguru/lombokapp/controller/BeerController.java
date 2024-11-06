/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.springguru.lombokapp.controller;

import com.springguru.lombokapp.model.Beer;
import com.springguru.lombokapp.service.BeerService;
import java.util.UUID;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;

/**
 *
 * @author mahmoud
 */
@Controller
@AllArgsConstructor
@Slf4j // logging
public class BeerController {
    
    private final BeerService beerService;
    
    public Beer getBeerById(UUID id){
        log.debug("Get Beer by Id - in controller");
        return beerService.getBeerById(id);
    }
    
}
