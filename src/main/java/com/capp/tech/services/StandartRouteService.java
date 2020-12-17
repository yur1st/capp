package com.capp.tech.services;

import com.capp.tech.mapping.CommonMapper;
import com.capp.tech.model.dto.StandartRouteDto;
import com.capp.tech.model.dto.revision.StandartRouteRevisionDto;
import com.capp.tech.model.entity.StandartRoute;
import com.capp.tech.repository.datajpa.StandartRouteRepository;
import org.springframework.stereotype.Service;

@Service
public class StandartRouteService extends AbstractService<StandartRoute, StandartRouteRepository,
        StandartRouteDto, StandartRouteRevisionDto,
        CommonMapper<StandartRoute, StandartRouteDto, StandartRouteRevisionDto>> {

    public StandartRouteService(StandartRouteRepository repository, CommonMapper<StandartRoute, StandartRouteDto, StandartRouteRevisionDto> mapper) {
        super(repository, mapper);
    }
}
