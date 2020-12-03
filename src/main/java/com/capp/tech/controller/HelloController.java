package com.capp.tech.controller;

import com.capp.tech.services.GuyService;
import com.capp.tech.model.Guy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

@RestController
public class HelloController {

    @Autowired
    private final GuyService guyService;

    public HelloController(GuyService guyService) {
        this.guyService = guyService;
    }

    @GetMapping("/api/hello")
    public String hello() {
        return "Hello, the time at the server is now " + new Date() + "\n";
    }

    @GetMapping(value = "api/map", produces = MediaType.APPLICATION_JSON_VALUE)
    public Set<Guy> helloMap() {

        return guyService.findAll();
    }

    @GetMapping(value = "api/map/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public Guy helloMapById(@PathVariable Long id) {

        return guyService.findById(id);
    }
}
