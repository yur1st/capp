package com.capp.tech.controller;

import com.capp.tech.model.dto.RouteStatusDto;
import com.capp.tech.model.dto.revision.RouteStatusRevisionDto;
import com.capp.tech.model.entity.RouteStatus;
import com.capp.tech.services.RouteStatusService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/route/status")
public class RouteStatusController extends AbstractController<RouteStatus, RouteStatusDto, RouteStatusRevisionDto,
        RouteStatusService> {

    public RouteStatusController(RouteStatusService service) {
        super(service);
    }
}
