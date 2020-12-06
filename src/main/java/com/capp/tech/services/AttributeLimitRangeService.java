package com.capp.tech.services;

import com.capp.tech.mapping.AttributeLimitRangeMapper;
import com.capp.tech.model.dto.AttributeLimitRangeDto;
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
        range.setAttributeLimitRangeMin(min);
        range.setAttributeLimitRangeMax(max);
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
        range.setAttributeLimitRangeMin(min);
        range.setAttributeLimitRangeMax(max);
        return repository.save(range);

    }
}
