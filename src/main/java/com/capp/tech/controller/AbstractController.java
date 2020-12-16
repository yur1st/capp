package com.capp.tech.controller;

import com.capp.tech.model.dto.BaseDto;
import com.capp.tech.model.entity.BaseEntity;
import com.capp.tech.services.CommonService;
import org.springframework.http.ResponseEntity;

public abstract class AbstractController<E extends BaseEntity, D extends BaseDto, R extends D,
        S extends CommonService<E, D, R>> implements CommonController<D, R> {

    private final S service;

    public AbstractController(S service) {
        this.service = service;
    }

    @Override
    public D getAttributeById(Long id) {
        return service.findById(id);
    }

    @Override
    public Iterable<D> listAll() {
        return service.findAll();
    }

    @Override
    public void deletebyId(Long id) {
        service.deleteById(id);
    }

    @Override
    public R getLastRevisionById(long id) {
        return service.findLastRevisionById(id);
    }

    @Override
    public Iterable<R> getAllRevisionById(long id) {
        return service.findAllRevisionsById(id);
    }

    @Override
    public ResponseEntity<D> create(D object) {
        return ResponseEntity.ok().body(service.save(object));
    }

    @Override
    public ResponseEntity<D> update(long id, D object) {
        return ResponseEntity.ok().body(service.update(id, object));
    }
}
