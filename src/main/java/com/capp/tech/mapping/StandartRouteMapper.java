package com.capp.tech.mapping;

import com.capp.tech.model.dto.StandartRouteDto;
import com.capp.tech.model.dto.revision.StandartRouteRevisionDto;
import com.capp.tech.model.entity.StandartRoute;
import org.mapstruct.Mapper;

@Mapper(config = CommonMapper.class)
public interface StandartRouteMapper extends CommonMapper<StandartRoute, StandartRouteDto, StandartRouteRevisionDto> {
}
