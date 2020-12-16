package com.capp.tech.controller;

import com.capp.tech.model.dto.BaseDto;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

public interface CommonController<D extends BaseDto, R extends D> {

    @GetMapping(value = "{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    D getAttributeById(@PathVariable Long id);

    @GetMapping(value = "/", produces = MediaType.APPLICATION_JSON_VALUE)
    Iterable<D> listAll();

    @DeleteMapping(value = "{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    void deletebyId(@PathVariable Long id);

    @GetMapping(value = "revision/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    R getLastRevisionById(@PathVariable long id);

    @GetMapping(value = "revisions/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    Iterable<R> getAllRevisionById(@PathVariable long id);

    @PostMapping(value = "/", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<D> create(@RequestBody D object);

    @PutMapping(value = "{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<D> update(@RequestBody long id, @RequestBody D object);

}
