package com.capp.tech.controller;

import com.capp.tech.model.dto.OperationDto;
import com.capp.tech.model.dto.revision.OperationRevisionDto;
import com.capp.tech.model.entity.Operation;
import com.capp.tech.services.OperationService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/operation")
public class OperationController extends AbstractController<Operation, OperationDto, OperationRevisionDto,
        OperationService> {

    public OperationController(OperationService service) {
        super(service);
    }
}
