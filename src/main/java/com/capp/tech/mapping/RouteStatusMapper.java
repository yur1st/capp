package com.capp.tech.mapping;

import com.capp.tech.model.dto.RouteStatusDto;
import com.capp.tech.model.dto.revision.RouteStatusRevisionDto;
import com.capp.tech.model.entity.RouteStatus;
import org.mapstruct.Mapper;

@Mapper(config = CommonMapper.class)
public interface RouteStatusMapper extends CommonMapper<RouteStatus, RouteStatusDto, RouteStatusRevisionDto> {
}
