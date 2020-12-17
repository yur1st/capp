package com.capp.tech.mapping;

import com.capp.tech.model.dto.AttributeTypeDto;
import com.capp.tech.model.dto.revision.AttributeTypeRevisionDto;
import com.capp.tech.model.entity.AttributeType;
import org.mapstruct.Mapper;

@Mapper(config = CommonMapper.class)
public interface AttributeTypeMapper extends CommonMapper<AttributeType, AttributeTypeDto, AttributeTypeRevisionDto> {
}
