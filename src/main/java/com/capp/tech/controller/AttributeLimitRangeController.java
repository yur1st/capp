package com.capp.tech.controller;

import com.capp.tech.model.dto.AttributeLimitRangeDto;
import com.capp.tech.model.entity.AttributeLimitRange;
import com.capp.tech.services.AttributeLimitRangeService;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class AttributeLimitRangeController {

    private final AttributeLimitRangeService service;

    public AttributeLimitRangeController(AttributeLimitRangeService service) {
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

    @DeleteMapping(value = "/api/attribute/limitrange/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity deletebyId(@PathVariable long id) {
        service.deleteById(id);
        HttpHeaders responseHeaders = new HttpHeaders();
        return ResponseEntity.ok().headers(responseHeaders).body(true);
    }

    @PostMapping(value = "api/attribute/limitrange", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<AttributeLimitRange> create(@ModelAttribute("attributeLimitRangeMin") double limitRangeMin,
                                                      @ModelAttribute("attributeLimitRangeMax") double limitRangeMax) {

        AttributeLimitRange range = service.save(limitRangeMin, limitRangeMax);
        return ResponseEntity.ok(range);
    }

    @PutMapping(value = "api/attribute/limitrange", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<AttributeLimitRange> update(@ModelAttribute("limitId") long id,
                                                      @ModelAttribute("attributeLimitRangeMin") double limitRangeMin,
                                                      @ModelAttribute("attributeLimitRangeMax") double limitRangeMax) {

        AttributeLimitRange range = service.update(id, limitRangeMin, limitRangeMax);
        return ResponseEntity.ok(range);
    }

}
