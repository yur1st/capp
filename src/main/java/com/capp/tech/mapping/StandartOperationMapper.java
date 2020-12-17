package com.capp.tech.mapping;

import com.capp.tech.model.dto.StandartOperationDto;
import com.capp.tech.model.dto.revision.StandartOperationRevisionDto;
import com.capp.tech.model.entity.StandartOperation;
import org.mapstruct.Mapper;

@Mapper(config = CommonMapper.class)
public interface StandartOperationMapper extends CommonMapper<StandartOperation, StandartOperationDto,
        StandartOperationRevisionDto> {
}
