package com.capp.tech.controller;

import com.capp.tech.model.dto.AttributeLimitDto;
import com.capp.tech.model.dto.revision.AttributeLimitRevisionDto;
import com.capp.tech.model.entity.AttributeLimit;
import com.capp.tech.services.AttributeLimitService;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/attribute/limit")
public class AttributeLimitController extends AbstractController<AttributeLimit, AttributeLimitDto,
        AttributeLimitRevisionDto, AttributeLimitService> {

    private AttributeLimitService service;

    public AttributeLimitController(AttributeLimitService service) {
        super(service);
        this.service = service;
    }

    @PatchMapping(value = {"{id}/addlimit", "/{id}/addlimit"}, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<AttributeLimitDto> addLimit(@PathVariable String id, @RequestParam("value") String value) {
        AttributeLimitDto limitDto = service.addLimit(value, Long.parseLong(id));
        return ResponseEntity.ok(limitDto);
    }

    @PatchMapping(value = {"{id}/removelimit", "/{id}/removelimit"}, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<AttributeLimitDto> removeLimit(@PathVariable String id, @RequestParam("value") String value) {
        AttributeLimitDto limitDto = service.removeLimit(value, Long.parseLong(id));
        return ResponseEntity.ok(limitDto);
    }
}
