/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.springguru.mvcintro.service;

import com.springguru.mvcintro.domain.Author;
import com.springguru.mvcintro.repo.AuthorRepo;
import org.springframework.stereotype.Service;

/**
 *
 * @author mahmoud
 */
@Service
public class AuthorServiceImpl implements AuthorService{

    private final AuthorRepo authorRepo;

    public AuthorServiceImpl(AuthorRepo authorRepo) {
        this.authorRepo = authorRepo;
    }
    
    @Override
    public Iterable<Author> findAll() {
        return authorRepo.findAll();
    }
    
    
    
}
