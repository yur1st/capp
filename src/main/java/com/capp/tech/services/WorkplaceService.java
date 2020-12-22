package com.capp.tech.services;

import com.capp.tech.model.entity.Workplace;
import com.capp.tech.repository.datajpa.WorkplaceRepository;
import org.springframework.stereotype.Service;

@Service
public class WorkplaceService extends AbstractService<Workplace, WorkplaceRepository> {

    public WorkplaceService(WorkplaceRepository repository) {
        super(repository);
    }
}
