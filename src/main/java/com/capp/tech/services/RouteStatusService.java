package com.capp.tech.services;

import com.capp.tech.mapping.CommonMapper;
import com.capp.tech.model.dto.RouteStatusDto;
import com.capp.tech.model.dto.revision.RouteStatusRevisionDto;
import com.capp.tech.model.entity.RouteStatus;
import com.capp.tech.repository.datajpa.RouteStatusRepository;
import org.springframework.stereotype.Service;

@Service
public class RouteStatusService extends AbstractService<RouteStatus, RouteStatusRepository,
        RouteStatusDto, RouteStatusRevisionDto, CommonMapper<RouteStatus, RouteStatusDto, RouteStatusRevisionDto>> {

    public RouteStatusService(RouteStatusRepository repository, CommonMapper<RouteStatus, RouteStatusDto, RouteStatusRevisionDto> mapper) {
        super(repository, mapper);
    }
}
