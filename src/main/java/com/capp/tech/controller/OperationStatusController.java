package com.capp.tech.controller;

import com.capp.tech.model.dto.OperationStatusDto;
import com.capp.tech.model.dto.revision.OperationStatusRevisionDto;
import com.capp.tech.model.entity.OperationStatus;
import com.capp.tech.services.OperationStatusService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/operation/status")
public class OperationStatusController extends AbstractController<OperationStatus, OperationStatusDto,
        OperationStatusRevisionDto, OperationStatusService> {

    public OperationStatusController(OperationStatusService service) {
        super(service);
    }
}
