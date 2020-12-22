package com.capp.tech.services;

import com.capp.tech.model.entity.BaseEntity;
import com.capp.tech.repository.datajpa.CommonRepository;
import org.springframework.data.history.Revision;

import javax.transaction.Transactional;

@Transactional
public abstract class AbstractService<E extends BaseEntity,
        C extends CommonRepository<E>>
        implements CommonService<E> {

    protected final C repository;

    public AbstractService(C repository) {
        this.repository = repository;
    }

    public E save(E object) {
        return repository.save(object);
    }

    public E update(Long id, E object) {
        if (id == object.getId()) return repository.save(object);
        else throw new RuntimeException();
    }

    public Iterable<E> findAll() {
        return repository.findAll();
    }

    public E findById(Long id) {
        return repository.findById(id).orElseThrow();
    }

    public void delete(E object) {
        repository.delete(object);
    }

    @Override
    public void deleteById(Long id) {
        repository.deleteById(id);
    }

    public Iterable<Revision<Integer, E>> findAllRevisionsById(Long id) {
        return repository.findRevisions(id);
    }

    public Revision<Integer, E> findLastRevisionById(Long id) {
        return repository.findLastChangeRevision(id).orElseThrow();

    }

}
