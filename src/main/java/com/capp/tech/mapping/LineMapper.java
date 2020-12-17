package com.capp.tech.mapping;

import com.capp.tech.model.dto.LineDto;
import com.capp.tech.model.dto.revision.LineRevisionDto;
import com.capp.tech.model.entity.Line;
import org.mapstruct.Mapper;

@Mapper(config = CommonMapper.class)
public interface LineMapper extends CommonMapper<Line, LineDto, LineRevisionDto> {
}
