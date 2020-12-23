package com.capp.tech.services;

import com.capp.tech.model.entity.AttributeLimitRange;
import com.capp.tech.repository.datajpa.AttributeLimitRangeRepository;
import org.springframework.data.history.Revision;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class AttributeLimitRangeService {

    private final AttributeLimitRangeRepository repository;


    public AttributeLimitRangeService(AttributeLimitRangeRepository repository) {
        this.repository = repository;
    }

    public Iterable<AttributeLimitRange> findAll() {
        return repository.findAll();
    }

    public AttributeLimitRange findById(Long aLong) {
        return repository.findById(aLong).orElseThrow();
    }

    public AttributeLimitRange save(double min, double max) {

        AttributeLimitRange range = new AttributeLimitRange();
        range.setMin(min);
        range.setMax(max);
        return repository.save(range);
    }

    public void delete(AttributeLimitRange object) {
        repository.delete(object);
    }

    public void deleteById(Long aLong) {
        repository.deleteById(aLong);
    }

    public AttributeLimitRange update(long id, double min, double max) {
        AttributeLimitRange range = new AttributeLimitRange();
        range.setId(id);
        range.setMin(min);
        range.setMax(max);
        return repository.save(range);

    }

    public Revision<Integer, AttributeLimitRange> findLastRevisionById(long id) {
        return repository.findLastChangeRevision(id).orElseThrow();
    }

    public Iterable<Revision<Integer, AttributeLimitRange>> findAllRevisionById(long id) {
        return repository.findRevisions(id);
    }
}
