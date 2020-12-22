package com.capp.tech.services;

import com.capp.tech.model.entity.Attribute;
import com.capp.tech.repository.datajpa.AttributeRepository;
import org.springframework.stereotype.Service;

@Service
public class AttributeService extends AbstractService<Attribute, AttributeRepository> {

    public AttributeService(AttributeRepository repository) {
        super(repository);
    }
}
