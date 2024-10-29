/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.springguru.mvcintro.service;

import com.springguru.mvcintro.domain.Book;

/**
 *
 * @author mahmoud
 */
public interface BookService {
    
    Iterable<Book> findAll();
    
}
