package com.capp.tech.services;

import com.capp.tech.model.entity.Route;
import com.capp.tech.repository.datajpa.RouteRepository;
import org.springframework.stereotype.Service;

@Service
public class RouteService extends AbstractService<Route, RouteRepository> {

    public RouteService(RouteRepository repository) {
        super(repository);
    }
}
