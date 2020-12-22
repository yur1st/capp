package com.capp.tech.services;

import com.capp.tech.model.entity.OperationStatus;
import com.capp.tech.repository.datajpa.OperationStatusRepository;
import org.springframework.stereotype.Service;

@Service
public class OperationStatusService extends AbstractService<OperationStatus, OperationStatusRepository> {

    public OperationStatusService(OperationStatusRepository repository) {
        super(repository);
    }
}
