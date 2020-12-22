package com.capp.tech.services;

import com.capp.tech.model.entity.BaseEntity;
import org.springframework.data.history.Revision;

public interface CommonService<E extends BaseEntity> {

    E save(E object);

    E update(Long id, E object);

    Iterable<E> findAll();

    E findById(Long id);

    void delete(E object);

    void deleteById(Long id);

    Iterable<Revision<Integer, E>> findAllRevisionsById(Long id);

    Revision<Integer, E> findLastRevisionById(Long id);


}
