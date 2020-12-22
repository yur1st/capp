package com.capp.tech.services;

import com.capp.tech.model.entity.Unit;
import com.capp.tech.repository.datajpa.UnitRepository;
import org.springframework.stereotype.Service;

@Service
public class UnitService extends AbstractService<Unit, UnitRepository> {

    public UnitService(UnitRepository repository) {
        super(repository);
    }
}

