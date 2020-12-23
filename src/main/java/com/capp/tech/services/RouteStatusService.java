package com.capp.tech.services;

import com.capp.tech.model.entity.RouteStatus;
import com.capp.tech.repository.datajpa.RouteStatusRepository;
import org.springframework.stereotype.Service;

@Service
public class RouteStatusService extends AbstractService<RouteStatus, RouteStatusRepository> {

    public RouteStatusService(RouteStatusRepository repository) {
        super(repository);
    }
}
