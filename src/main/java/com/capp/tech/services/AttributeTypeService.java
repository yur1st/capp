package com.capp.tech.services;

import com.capp.tech.mapping.CommonMapper;
import com.capp.tech.model.dto.AttributeTypeDto;
import com.capp.tech.model.dto.revision.AttributeTypeRevisionDto;
import com.capp.tech.model.entity.AttributeType;
import com.capp.tech.repository.datajpa.AttributeTypeRepository;
import org.springframework.stereotype.Service;

@Service
public class AttributeTypeService extends AbstractService<AttributeType, AttributeTypeRepository,
        AttributeTypeDto, AttributeTypeRevisionDto, CommonMapper<AttributeType, AttributeTypeDto, AttributeTypeRevisionDto>> {

    public AttributeTypeService(AttributeTypeRepository repository, CommonMapper<AttributeType, AttributeTypeDto, AttributeTypeRevisionDto> mapper) {
        super(repository, mapper);
    }
}
