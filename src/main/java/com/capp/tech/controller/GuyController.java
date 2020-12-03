package com.capp.tech.controller;

import com.capp.tech.model.entity.Guy;
import com.capp.tech.services.GuyService;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Set;

@RestController
public class GuyController {

    private final GuyService guyService;

    public GuyController(GuyService guyService) {
        this.guyService = guyService;
    }

    @GetMapping(value = "api/guy", produces = MediaType.APPLICATION_JSON_VALUE)
    public Set<Guy> listAll() {

        return guyService.findAll();
    }

    @GetMapping(value = "api/guy/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public Guy listById(@PathVariable Long id) {

        return guyService.findById(id);
    }

}
