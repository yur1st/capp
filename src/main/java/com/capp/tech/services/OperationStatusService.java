package com.capp.tech.services;

import com.capp.tech.mapping.CommonMapper;
import com.capp.tech.model.dto.OperationStatusDto;
import com.capp.tech.model.dto.revision.OperationStatusRevisionDto;
import com.capp.tech.model.entity.OperationStatus;
import com.capp.tech.repository.datajpa.OperationStatusRepository;
import org.springframework.stereotype.Service;

@Service
public class OperationStatusService extends AbstractService<OperationStatus, OperationStatusRepository,
        OperationStatusDto, OperationStatusRevisionDto,
        CommonMapper<OperationStatus, OperationStatusDto, OperationStatusRevisionDto>> {

    public OperationStatusService(OperationStatusRepository repository, CommonMapper<OperationStatus, OperationStatusDto, OperationStatusRevisionDto> mapper) {
        super(repository, mapper);
    }
}
