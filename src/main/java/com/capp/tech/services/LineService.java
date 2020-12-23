package com.capp.tech.services;

import com.capp.tech.model.entity.Line;
import com.capp.tech.repository.datajpa.LineRepository;
import org.springframework.stereotype.Service;

@Service
public class LineService extends AbstractService<Line, LineRepository> {

    public LineService(LineRepository repository) {
        super(repository);
    }
}
