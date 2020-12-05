package com.capp.tech.services.datajpa;

import com.capp.tech.mapping.AttributeLimitRangeMapper;
import com.capp.tech.model.dto.AttributeLimitRangeDto;
import com.capp.tech.model.entity.AttributeLimitRange;
import com.capp.tech.repository.AttributeLimitRangeRepository;
import com.capp.tech.services.AttributeLimitRangeService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@Service
@Transactional
public class AttributeServiceJpa implements AttributeLimitRangeService {

    private final AttributeLimitRangeRepository repository;
    private final AttributeLimitRangeMapper mapper;

    public AttributeServiceJpa(AttributeLimitRangeRepository repository, AttributeLimitRangeMapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    @Override
    public Iterable<AttributeLimitRangeDto> findAll() {
        return StreamSupport.stream(repository.findAll().spliterator(), false)
                .map(value -> mapper.toDto(value))
                .collect(Collectors.toList());
    }

    @Override
    public AttributeLimitRangeDto findById(Long aLong) {
        return mapper.toDto(repository.findById(aLong).orElseThrow());
    }

    @Override
    public AttributeLimitRange save(AttributeLimitRange object) {
        return repository.save(object);
    }

    @Override
    public void delete(AttributeLimitRange object) {

    }

    @Override
    public void deleteById(Long aLong) {

    }
}
