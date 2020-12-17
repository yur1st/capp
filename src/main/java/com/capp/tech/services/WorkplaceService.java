package com.capp.tech.services;

import com.capp.tech.mapping.CommonMapper;
import com.capp.tech.model.dto.WorkplaceDto;
import com.capp.tech.model.dto.revision.WorkplaceRevisionDto;
import com.capp.tech.model.entity.Workplace;
import com.capp.tech.repository.datajpa.WorkplaceRepository;
import org.springframework.stereotype.Service;

@Service
public class WorkplaceService extends AbstractService<Workplace, WorkplaceRepository,
        WorkplaceDto, WorkplaceRevisionDto, CommonMapper<Workplace, WorkplaceDto, WorkplaceRevisionDto>> {

    public WorkplaceService(WorkplaceRepository repository, CommonMapper<Workplace, WorkplaceDto, WorkplaceRevisionDto> mapper) {
        super(repository, mapper);
    }
}
