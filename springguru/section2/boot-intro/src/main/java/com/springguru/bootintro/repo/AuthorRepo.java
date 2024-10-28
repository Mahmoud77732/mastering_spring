package com.springguru.bootintro.repo;

import com.springguru.bootintro.domain.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepo extends CrudRepository<Author, Long> {

}
