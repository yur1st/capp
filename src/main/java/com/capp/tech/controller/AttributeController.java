package com.capp.tech.controller;

import com.capp.tech.model.dto.AttributeLimitRangeDto;
import com.capp.tech.services.AttributeLimitRangeService;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AttributeController {

    private final AttributeLimitRangeService service;

    public AttributeController(AttributeLimitRangeService service) {
        this.service = service;
    }


    @GetMapping(value = "api/attribute/limitrange/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public AttributeLimitRangeDto getAttributeById(@PathVariable long id) {

        return service.findById(id);
    }

    @GetMapping(value = "api/attribute/limitrange", produces = MediaType.APPLICATION_JSON_VALUE)
    public Iterable<AttributeLimitRangeDto> listAll() {

        return service.findAll();
    }

}
