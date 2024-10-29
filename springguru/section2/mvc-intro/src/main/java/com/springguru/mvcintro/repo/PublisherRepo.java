package com.springguru.mvcintro.repo;

import com.springguru.mvcintro.domain.Publisher;
import org.springframework.data.repository.CrudRepository;

public interface PublisherRepo extends CrudRepository<Publisher, Long> {
}
