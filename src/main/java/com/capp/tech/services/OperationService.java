package com.capp.tech.services;

import com.capp.tech.model.entity.Operation;
import com.capp.tech.repository.datajpa.OperationRepository;
import org.springframework.stereotype.Service;

@Service
public class OperationService extends AbstractService<Operation, OperationRepository> {

    public OperationService(OperationRepository repository) {
        super(repository);
    }
}
