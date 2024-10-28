package com.springguru.h2db.repo;

import com.springguru.h2db.domain.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepo extends CrudRepository<Author, Long> {

}
