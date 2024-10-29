package com.springguru.mvcintro.repo;

import com.springguru.mvcintro.domain.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepo extends CrudRepository<Author, Long> {

}
