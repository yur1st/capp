package com.capp.tech.services;

public interface CrudService<T, ID> {

    Iterable<T> findAll();

    T findById(ID id);

    T save(T object);

    void delete(T object);

    void deleteById(ID id);

}
