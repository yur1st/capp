package com.capp.tech.controller;

import com.capp.tech.model.dto.LineDto;
import com.capp.tech.model.dto.revision.LineRevisionDto;
import com.capp.tech.model.entity.Line;
import com.capp.tech.services.LineService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/line")
public class LineController extends AbstractController<Line, LineDto, LineRevisionDto, LineService> {

    public LineController(LineService service) {
        super(service);
    }
}
