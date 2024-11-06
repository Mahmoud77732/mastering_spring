/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.springguru.lombokapp.service;

import com.springguru.lombokapp.model.Beer;
import com.springguru.lombokapp.model.BeerStyle;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.UUID;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 *
 * @author mahmoud
 */
@Service
@Slf4j // logging
public class BeerServiceImpl implements BeerService{

    @Override
    public Beer getBeerById(UUID id) {
        log.debug("Get Beer by Id - in service. Id: " + id.toString());
        return Beer.builder()
                .id(id)
                .version(1)
                .beerName("Galaxy_Cat")
                .beerStyle(BeerStyle.PALE_ALE)
                .upc("12356")
                .Price(new BigDecimal("12.99"))
                .quantityOnHand(122)
                .createdDate(LocalDateTime.now())
                .updateDate(LocalDateTime.now())
                .build();
    }
    
}
