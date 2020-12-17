package com.capp.tech.mapping;

import com.capp.tech.model.dto.OperationStatusDto;
import com.capp.tech.model.dto.revision.OperationStatusRevisionDto;
import com.capp.tech.model.entity.OperationStatus;
import org.mapstruct.Mapper;

@Mapper(config = CommonMapper.class)
public interface OperationStatusMapper extends CommonMapper<OperationStatus, OperationStatusDto, OperationStatusRevisionDto> {
}
