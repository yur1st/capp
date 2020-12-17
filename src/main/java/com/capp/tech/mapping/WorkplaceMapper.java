package com.capp.tech.mapping;

import com.capp.tech.model.dto.WorkplaceDto;
import com.capp.tech.model.dto.revision.WorkplaceRevisionDto;
import com.capp.tech.model.entity.Workplace;
import org.mapstruct.Mapper;

@Mapper(config = CommonMapper.class)
public interface WorkplaceMapper extends CommonMapper<Workplace, WorkplaceDto, WorkplaceRevisionDto> {
}
