package com.springguru.h2db.repo;

import com.springguru.h2db.domain.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepo extends CrudRepository<Book, Long> {

}
