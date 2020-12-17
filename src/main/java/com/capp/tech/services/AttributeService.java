package com.capp.tech.services;

import com.capp.tech.mapping.CommonMapper;
import com.capp.tech.model.dto.AttributeDto;
import com.capp.tech.model.dto.revision.AttributeRevisionDto;
import com.capp.tech.model.entity.Attribute;
import com.capp.tech.repository.datajpa.AttributeRepository;
import org.springframework.stereotype.Service;

@Service
public class AttributeService extends AbstractService<Attribute, AttributeRepository,
        AttributeDto, AttributeRevisionDto, CommonMapper<Attribute, AttributeDto, AttributeRevisionDto>> {

    public AttributeService(AttributeRepository repository, CommonMapper<Attribute, AttributeDto, AttributeRevisionDto> mapper) {
        super(repository, mapper);
    }
}
