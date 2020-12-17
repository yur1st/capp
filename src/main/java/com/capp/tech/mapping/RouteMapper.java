package com.capp.tech.mapping;

import com.capp.tech.model.dto.RouteDto;
import com.capp.tech.model.dto.revision.RouteRevisionDto;
import com.capp.tech.model.entity.Route;
import org.mapstruct.Mapper;

@Mapper(config = CommonMapper.class)
public interface RouteMapper extends CommonMapper<Route, RouteDto, RouteRevisionDto> {

    @Override
    default Route toEntity(RouteDto dto) {
        return null;
    }
}
