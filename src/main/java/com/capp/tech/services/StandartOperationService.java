package com.capp.tech.services;

import com.capp.tech.mapping.CommonMapper;
import com.capp.tech.model.dto.StandartOperationDto;
import com.capp.tech.model.dto.revision.StandartOperationRevisionDto;
import com.capp.tech.model.entity.StandartOperation;
import com.capp.tech.repository.datajpa.StandartOperationRepository;
import org.springframework.stereotype.Service;

@Service
public class StandartOperationService extends AbstractService<StandartOperation, StandartOperationRepository,
        StandartOperationDto, StandartOperationRevisionDto,
        CommonMapper<StandartOperation, StandartOperationDto, StandartOperationRevisionDto>> {

    public StandartOperationService(StandartOperationRepository repository, CommonMapper<StandartOperation, StandartOperationDto, StandartOperationRevisionDto> mapper) {
        super(repository, mapper);
    }
}
