package com.capp.tech.services;

import com.capp.tech.mapping.AttributeLimitRangeMapper;
import com.capp.tech.model.dto.AttributeLimitRangeDto;
import com.capp.tech.model.dto.revision.AttributeLimitRangeRevisionDto;
import com.capp.tech.model.entity.AttributeLimitRange;
import com.capp.tech.repository.datajpa.AttributeLimitRangeRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@Service
@Transactional
public class AttributeLimitRangeService {

    private final AttributeLimitRangeRepository repository;
    private final AttributeLimitRangeMapper mapper;

    public AttributeLimitRangeService(AttributeLimitRangeRepository repository, AttributeLimitRangeMapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    public Iterable<AttributeLimitRangeDto> findAll() {
        return StreamSupport.stream(repository.findAll().spliterator(), false)
                .map(value -> mapper.toDto(value))
                .collect(Collectors.toList());
    }

    public AttributeLimitRangeDto findById(Long aLong) {
        return mapper.toDto(repository.findById(aLong).orElseThrow());
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

    public AttributeLimitRangeRevisionDto findLastRevisionById(long id) {
        return mapper.toRevisionDto(repository.findLastChangeRevision(id).orElseThrow());
    }

    public Iterable<AttributeLimitRangeRevisionDto> findAllRevisionById(long id) {
        return repository.findRevisions(id).stream()
                .map(rev -> mapper.toRevisionDto(rev))
                .collect(Collectors.toList());
    }
}
