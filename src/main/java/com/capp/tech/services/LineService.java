package com.capp.tech.services;

import com.capp.tech.mapping.CommonMapper;
import com.capp.tech.model.dto.LineDto;
import com.capp.tech.model.dto.revision.LineRevisionDto;
import com.capp.tech.model.entity.Line;
import com.capp.tech.repository.datajpa.LineRepository;
import org.springframework.stereotype.Service;

@Service
public class LineService extends AbstractService<Line, LineRepository,
        LineDto, LineRevisionDto, CommonMapper<Line, LineDto, LineRevisionDto>> {

    public LineService(LineRepository repository, CommonMapper<Line, LineDto, LineRevisionDto> mapper) {
        super(repository, mapper);
    }
}
