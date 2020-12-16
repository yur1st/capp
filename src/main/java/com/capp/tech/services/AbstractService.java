package com.capp.tech.services;

import com.capp.tech.mapping.CommonMapper;
import com.capp.tech.model.dto.BaseDto;
import com.capp.tech.model.entity.BaseEntity;
import com.capp.tech.repository.datajpa.CommonRepository;
import org.springframework.data.history.Revision;

import java.util.stream.Collectors;

public abstract class AbstractService<E extends BaseEntity,
        C extends CommonRepository<E>, D extends BaseDto, R extends D,
        M extends CommonMapper<E, D, R>>
        implements CommonService<E, D, R> {

    protected final C repository;

    protected final M mapper;

    public AbstractService(C repository, M mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    public D save(D object) {
        return mapper.toDto(repository.save(mapper.toEntity(object)));
    }

    public D update(Long id, D object) {
        if (id == object.getId()) return mapper.toDto(repository.save(mapper.toEntity(object)));
        else throw new RuntimeException();
    }

    public Iterable<D> findAll() {
        return repository.findAll().stream()
                .map(mapper::toDto)
                .collect(Collectors.toList());
    }

    public D findById(Long id) {
        return mapper.toDto(repository.findById(id).orElseThrow());
    }

    public void delete(D object) {
        repository.delete(mapper.toEntity(object));
    }

    @Override
    public void deleteById(Long id) {
        repository.deleteById(id);
    }

    public Iterable<R> findAllRevisionsById(Long id) {
        return repository.findRevisions(id).stream()
                .map(v -> mapper.toRevisionDto(v.getEntity(), v.getMetadata()))
                .collect(Collectors.toList());
    }

    public R findLastRevisionById(Long id) {
        Revision<Integer, E> revision = repository.findLastChangeRevision(id).orElseThrow();
        return mapper.toRevisionDto(revision.getEntity(), revision.getMetadata());
    }

}
