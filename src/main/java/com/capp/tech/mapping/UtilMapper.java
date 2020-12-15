package com.capp.tech.mapping;

import org.mapstruct.Mapper;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneOffset;

@Mapper
public interface UtilMapper {

    static LocalDateTime mapInstanceToLDT(Instant value) {
        return LocalDateTime.ofInstant(value, ZoneOffset.UTC);
    }
}
