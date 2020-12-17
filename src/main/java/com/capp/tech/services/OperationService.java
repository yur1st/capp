package com.capp.tech.services;

import com.capp.tech.mapping.CommonMapper;
import com.capp.tech.model.dto.OperationDto;
import com.capp.tech.model.dto.revision.OperationRevisionDto;
import com.capp.tech.model.entity.Operation;
import com.capp.tech.repository.datajpa.OperationRepository;
import org.springframework.stereotype.Service;

@Service
public class OperationService extends AbstractService<Operation, OperationRepository,
        OperationDto, OperationRevisionDto, CommonMapper<Operation, OperationDto, OperationRevisionDto>> {

    public OperationService(OperationRepository repository, CommonMapper<Operation, OperationDto, OperationRevisionDto> mapper) {
        super(repository, mapper);
    }
}
