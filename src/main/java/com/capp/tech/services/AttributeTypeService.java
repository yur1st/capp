package com.capp.tech.services;

import com.capp.tech.model.entity.AttributeType;
import com.capp.tech.repository.datajpa.AttributeTypeRepository;
import org.springframework.stereotype.Service;

@Service
public class AttributeTypeService extends AbstractService<AttributeType, AttributeTypeRepository> {

    public AttributeTypeService(AttributeTypeRepository repository) {
        super(repository);
    }
}
