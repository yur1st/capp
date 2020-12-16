package com.capp.tech.mapping;

import com.capp.tech.model.dto.UnitDto;
import com.capp.tech.model.dto.revision.UnitRevisionDto;
import com.capp.tech.model.entity.Unit;
import org.mapstruct.Mapper;

@Mapper(config = CommonMapper.class)
public interface UnitMapper extends CommonMapper<Unit, UnitDto, UnitRevisionDto> {
}
