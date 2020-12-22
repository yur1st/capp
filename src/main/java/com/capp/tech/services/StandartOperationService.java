package com.capp.tech.services;

import com.capp.tech.model.entity.StandartOperation;
import com.capp.tech.repository.datajpa.StandartOperationRepository;
import org.springframework.stereotype.Service;

@Service
public class StandartOperationService extends AbstractService<StandartOperation, StandartOperationRepository> {

    public StandartOperationService(StandartOperationRepository repository) {
        super(repository);
    }
}
