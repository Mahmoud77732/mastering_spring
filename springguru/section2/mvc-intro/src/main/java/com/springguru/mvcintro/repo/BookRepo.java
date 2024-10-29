package com.springguru.mvcintro.repo;

import com.springguru.mvcintro.domain.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepo extends CrudRepository<Book, Long> {

}
