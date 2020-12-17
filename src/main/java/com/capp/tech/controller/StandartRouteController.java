package com.capp.tech.controller;

import com.capp.tech.model.dto.StandartRouteDto;
import com.capp.tech.model.dto.revision.StandartRouteRevisionDto;
import com.capp.tech.model.entity.StandartRoute;
import com.capp.tech.services.StandartRouteService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/standart/route")
public class StandartRouteController extends AbstractController<StandartRoute, StandartRouteDto,
        StandartRouteRevisionDto, StandartRouteService> {

    public StandartRouteController(StandartRouteService service) {
        super(service);
    }
}
