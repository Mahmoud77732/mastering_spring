/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.springguru.lombokapp.service;

import com.springguru.lombokapp.model.Beer;
import java.util.UUID;

/**
 *
 * @author mahmoud
 */
public interface BeerService {

    Beer getBeerById(UUID id);
    
}
