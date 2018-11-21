package com.example.service;

import com.example.entity.Foo;
import com.example.repository.FooRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.LinkedList;
import java.util.List;

@Service
public class FooService {

    private static final Logger LOGGER = LoggerFactory.getLogger(FooService.class);

    private FooRepository fooRepository;

    public FooService(@Autowired FooRepository fooRepository) {
        this.fooRepository = fooRepository;
    }

    @Transactional
    public void createFoo() {
        fooRepository.save(new Foo());
        LOGGER.info("Foo created");
    }

    public List<Foo> listFoes() {
        List<Foo> result = new LinkedList<>();
        for (Foo foo : fooRepository.findAll()) {
            result.add(foo);
        }
        return result;
    }

    @Transactional
    public void clearFoes() {
        fooRepository.deleteAll();
    }

    public Long count() {
        return fooRepository.count();
    }

    @Transactional
    public void createFoes(int number) {
        for (int i = 0; i < number; i++) {
            createFoo();
        }
    }
}
