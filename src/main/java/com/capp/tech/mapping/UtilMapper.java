package com.capp.tech.mapping;

import com.capp.tech.model.dto.OperationDto;
import com.capp.tech.model.entity.OperationRoute;
import org.mapstruct.Mapper;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneOffset;

@Mapper
public abstract class UtilMapper {

    private static OperationMapper operationMapper;

    static LocalDateTime mapInstanceToLDT(Instant value) {
        return LocalDateTime.ofInstant(value, ZoneOffset.UTC);
    }

    static OperationDto mapOpertationRouteToOperationDto(OperationRoute operationRoute) {
        return operationMapper.toDto(operationRoute.getOperation());
    }

}
