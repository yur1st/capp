package com.capp.tech.controller;

import com.capp.tech.model.dto.UnitDto;
import com.capp.tech.model.dto.revision.UnitRevisionDto;
import com.capp.tech.model.entity.Unit;
import com.capp.tech.services.UnitService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/unit")
public class UnitController extends AbstractController<Unit, UnitDto, UnitRevisionDto, UnitService> {

    public UnitController(UnitService service) {
        super(service);
    }
}
