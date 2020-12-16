package com.capp.tech.services;

import com.capp.tech.model.dto.BaseDto;
import com.capp.tech.model.entity.BaseEntity;

public interface CommonService<E extends BaseEntity, D extends BaseDto, R extends D> {

    D save(D object);

    D update(Long id, D object);

    Iterable<D> findAll();

    D findById(Long id);

    void delete(D object);

    void deleteById(Long id);

    Iterable<R> findAllRevisionsById(Long id);

    R findLastRevisionById(Long id);


}
