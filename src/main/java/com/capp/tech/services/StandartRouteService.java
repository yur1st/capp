package com.capp.tech.services;

import com.capp.tech.model.entity.StandartRoute;
import com.capp.tech.repository.datajpa.StandartRouteRepository;
import org.springframework.stereotype.Service;

@Service
public class StandartRouteService extends AbstractService<StandartRoute, StandartRouteRepository> {

    public StandartRouteService(StandartRouteRepository repository) {
        super(repository);
    }
}
