package com.capp.tech.model.dto;

import lombok.Data;

import java.util.Set;

@Data
public class AttributeLimitDto extends BaseDto {
    private Set<String> possibleValues;
}
