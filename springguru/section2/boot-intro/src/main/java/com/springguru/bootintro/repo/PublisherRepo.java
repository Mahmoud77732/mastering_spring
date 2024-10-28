package com.springguru.bootintro.repo;

import com.springguru.bootintro.domain.Publisher;
import org.springframework.data.repository.CrudRepository;

public interface PublisherRepo extends CrudRepository<Publisher, Long> {
}
