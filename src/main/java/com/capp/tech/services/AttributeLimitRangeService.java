package com.capp.tech.services;

import com.capp.tech.model.dto.AttributeLimitRangeDto;
import com.capp.tech.model.entity.AttributeLimitRange;

public interface AttributeLimitRangeService {

    Iterable<AttributeLimitRangeDto> findAll();

    AttributeLimitRangeDto findById(Long id);

    AttributeLimitRange save(AttributeLimitRange object);

    void delete(AttributeLimitRange object);

    void deleteById(Long id);
}
