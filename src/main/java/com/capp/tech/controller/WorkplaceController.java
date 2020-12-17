package com.capp.tech.controller;

import com.capp.tech.model.dto.WorkplaceDto;
import com.capp.tech.model.dto.revision.WorkplaceRevisionDto;
import com.capp.tech.model.entity.Workplace;
import com.capp.tech.services.WorkplaceService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/workplace")
public class WorkplaceController extends AbstractController<Workplace, WorkplaceDto, WorkplaceRevisionDto,
        WorkplaceService> {

    public WorkplaceController(WorkplaceService service) {
        super(service);
    }
}
