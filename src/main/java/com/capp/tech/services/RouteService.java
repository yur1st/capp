package com.capp.tech.services;

import com.capp.tech.mapping.CommonMapper;
import com.capp.tech.model.dto.RouteDto;
import com.capp.tech.model.dto.revision.RouteRevisionDto;
import com.capp.tech.model.entity.Route;
import com.capp.tech.repository.datajpa.RouteRepository;
import org.springframework.stereotype.Service;

@Service
public class RouteService extends AbstractService<Route, RouteRepository,
        RouteDto, RouteRevisionDto, CommonMapper<Route, RouteDto, RouteRevisionDto>> {

    public RouteService(RouteRepository repository, CommonMapper<Route, RouteDto, RouteRevisionDto> mapper) {
        super(repository, mapper);
    }
}
