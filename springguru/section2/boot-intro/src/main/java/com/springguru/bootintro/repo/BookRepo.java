package com.springguru.bootintro.repo;

import com.springguru.bootintro.domain.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepo extends CrudRepository<Book, Long> {

}
