package com.capp.tech.mapping;

import com.capp.tech.model.dto.OperationDto;
import com.capp.tech.model.dto.revision.OperationRevisionDto;
import com.capp.tech.model.entity.Operation;
import org.mapstruct.Mapper;

@Mapper(config = CommonMapper.class)
public interface OperationMapper extends CommonMapper<Operation, OperationDto, OperationRevisionDto> {
}
