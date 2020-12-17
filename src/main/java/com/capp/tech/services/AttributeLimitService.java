package com.capp.tech.services;

import com.capp.tech.mapping.CommonMapper;
import com.capp.tech.model.dto.AttributeLimitDto;
import com.capp.tech.model.dto.revision.AttributeLimitRevisionDto;
import com.capp.tech.model.entity.AttributeLimit;
import com.capp.tech.repository.datajpa.AttributeLimitRepository;
import org.springframework.stereotype.Service;

@Service
public class AttributeLimitService extends AbstractService<AttributeLimit, AttributeLimitRepository,
        AttributeLimitDto, AttributeLimitRevisionDto, CommonMapper<AttributeLimit,
        AttributeLimitDto, AttributeLimitRevisionDto>> {

    public AttributeLimitService(AttributeLimitRepository repository, CommonMapper<AttributeLimit, AttributeLimitDto, AttributeLimitRevisionDto> mapper) {
        super(repository, mapper);
    }

    public AttributeLimitDto addLimit(String limit, Long id) {
        repository.addLimit(limit, id);
        return mapper.toDto(repository.findById(id).get());

    }
}
