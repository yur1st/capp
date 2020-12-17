package com.capp.tech.model.dto;

import lombok.Data;

import java.util.HashSet;
import java.util.Set;

@Data
public class StandartOperationDto extends BaseDto {

    private String name;

    private Set<AttributeDto> attributes = new HashSet<>();
}
