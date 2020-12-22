package com.capp.tech.services;

import com.capp.tech.model.entity.AttributeLimit;
import com.capp.tech.repository.datajpa.AttributeLimitRepository;
import org.springframework.stereotype.Service;

@Service
public class AttributeLimitService extends AbstractService<AttributeLimit, AttributeLimitRepository> {

    public AttributeLimitService(AttributeLimitRepository repository) {
        super(repository);
    }

    public AttributeLimit addLimit(String limit, Long id) {
        AttributeLimit attributeLimit = repository.findById(id).get();
        attributeLimit.getPossibleValues().add(limit);
        return repository.save(attributeLimit);
    }

    public AttributeLimit removeLimit(String limit, Long id) {
        AttributeLimit attributeLimit = repository.findById(id).get();
        attributeLimit.getPossibleValues().remove(limit);
        return repository.save(attributeLimit);
    }
}
