package com.capp.tech.controller;

import com.capp.tech.model.dto.StandartOperationDto;
import com.capp.tech.model.dto.revision.StandartOperationRevisionDto;
import com.capp.tech.model.entity.StandartOperation;
import com.capp.tech.services.StandartOperationService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/standart/operation")
public class StandartOperationController extends AbstractController<StandartOperation,
        StandartOperationDto, StandartOperationRevisionDto, StandartOperationService> {

    public StandartOperationController(StandartOperationService service) {
        super(service);
    }
}
