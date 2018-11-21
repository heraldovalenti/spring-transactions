package com.example.controller;

import com.example.entity.Foo;
import com.example.service.FooService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("foo")
public class FooController {

    @Autowired
    private FooService fooService;

    public FooController(@Autowired FooService fooService) {
        this.fooService = fooService;
    }

    @RequestMapping("create")
    public void createFoo() {
        fooService.createFoo();
    }

    @RequestMapping("create/{number}")
    public void createFoes(@PathVariable int number) {
        fooService.createFoes(number);
    }

    @RequestMapping("list")
    public List<Foo> listFoes() {
        return fooService.listFoes();
    }

    @RequestMapping("count")
    public long countFoes() {
        return fooService.count();
    }

    @RequestMapping("clear")
    public Map<String, Long> clearFoes() {
        HashMap<String,Long> result = new HashMap<>();
        result.put("begin count", fooService.count());
        fooService.clearFoes();
        result.put("end count", fooService.count());
        return result;
    }
}
