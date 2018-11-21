package com.example.repository;

import com.example.entity.Foo;
import org.springframework.data.repository.CrudRepository;

public interface FooRepository extends CrudRepository<Foo, Long> {
}
