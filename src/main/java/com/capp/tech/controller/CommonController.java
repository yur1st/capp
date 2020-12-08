package com.capp.tech.controller;

import com.capp.tech.model.dto.BaseDto;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

public interface CommonController<D extends BaseDto, R extends D> {

    @GetMapping(value = "list/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    D getAttributeById(@PathVariable Long id);

    @GetMapping(value = "list", produces = MediaType.APPLICATION_JSON_VALUE)
    Iterable<D> listAll();

    @GetMapping(value = "delete/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    void deletebyId(@PathVariable Long id);

    @GetMapping(value = "revision/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    R getLastRevisionById(@PathVariable long id);

    @GetMapping(value = "revisions/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    Iterable<R> getAllRevisionById(@PathVariable long id);

    @PostMapping(value = "create", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<D> create(@RequestBody D object);

    @PostMapping(value = "update", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<D> update(@RequestBody long id, @RequestBody D object);

}
