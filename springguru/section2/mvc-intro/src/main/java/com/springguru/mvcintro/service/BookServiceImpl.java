/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.springguru.mvcintro.service;

import com.springguru.mvcintro.domain.Book;
import com.springguru.mvcintro.repo.BookRepo;
import org.springframework.stereotype.Service;

/**
 *
 * @author mahmoud
 */
@Service
public class BookServiceImpl implements BookService{
    
    private final BookRepo bookRepo;

    public BookServiceImpl(BookRepo bookRepo) {
        this.bookRepo = bookRepo;
    }
    
    @Override
    public Iterable<Book> findAll(){
        return bookRepo.findAll();
    }
    
}
