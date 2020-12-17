package com.capp.tech.controller;

import com.capp.tech.model.dto.AttributeDto;
import com.capp.tech.model.dto.revision.AttributeRevisionDto;
import com.capp.tech.model.entity.Attribute;
import com.capp.tech.services.AttributeService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/attribute")
public class AttributeController extends AbstractController<Attribute, AttributeDto, AttributeRevisionDto,
        AttributeService> {

    public AttributeController(AttributeService service) {
        super(service);
    }
}
