package com.capp.tech.controller;

import com.capp.tech.model.dto.AttributeTypeDto;
import com.capp.tech.model.dto.revision.AttributeTypeRevisionDto;
import com.capp.tech.model.entity.AttributeType;
import com.capp.tech.services.AttributeTypeService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/attribute/type")
public class AttributeTypeController extends AbstractController<AttributeType, AttributeTypeDto,
        AttributeTypeRevisionDto, AttributeTypeService> {

    public AttributeTypeController(AttributeTypeService service) {
        super(service);
    }
}
