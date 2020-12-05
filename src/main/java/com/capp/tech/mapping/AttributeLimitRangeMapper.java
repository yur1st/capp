package com.capp.tech.mapping;

import com.capp.tech.model.dto.AttributeLimitRangeDto;
import com.capp.tech.model.entity.AttributeLimitRange;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(unmappedSourcePolicy = ReportingPolicy.IGNORE, componentModel = "spring")
public interface AttributeLimitRangeMapper {

    AttributeLimitRangeDto toDto(AttributeLimitRange range);
}
