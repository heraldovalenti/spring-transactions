package com.example.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController()
@RequestMapping(path = "date")
public class DateController {

    @RequestMapping(method = RequestMethod.GET, path = "/withDash")
    public Date nowWithDash() {
        return now();
    }

    @RequestMapping(method = RequestMethod.GET, path = "withoutDash")
    public Date nowWithoutDash() {
        return now();
    }

    private Date now() {
        return new Date();
    }

}
