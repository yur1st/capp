package com.capp.tech.mapping;

import com.capp.tech.model.dto.AttributeDto;
import com.capp.tech.model.dto.revision.AttributeRevisionDto;
import com.capp.tech.model.entity.Attribute;
import org.mapstruct.Mapper;

@Mapper(config = CommonMapper.class, uses = {AttributeLimitMapper.class, AttributeLimitRangeMapper.class})
public interface AttributeMapper extends CommonMapper<Attribute, AttributeDto, AttributeRevisionDto> {
}
