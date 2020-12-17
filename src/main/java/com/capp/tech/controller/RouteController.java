package com.capp.tech.controller;

import com.capp.tech.model.dto.RouteDto;
import com.capp.tech.model.dto.revision.RouteRevisionDto;
import com.capp.tech.model.entity.Route;
import com.capp.tech.services.RouteService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/route")
public class RouteController extends AbstractController<Route, RouteDto, RouteRevisionDto,
        RouteService> {

    public RouteController(RouteService service) {
        super(service);
    }
}
