package com.greglturnquist.hackingspringboot.reactive;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BlockingItemRepository extends CrudRepository<Item, String> {
}