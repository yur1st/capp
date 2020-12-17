package com.capp.tech.mapping;

import com.capp.tech.model.dto.AttributeLimitDto;
import com.capp.tech.model.dto.revision.AttributeLimitRevisionDto;
import com.capp.tech.model.entity.AttributeLimit;
import org.mapstruct.Mapper;

@Mapper(config = CommonMapper.class)
public interface AttributeLimitMapper extends CommonMapper<AttributeLimit, AttributeLimitDto,
        AttributeLimitRevisionDto> {
}
