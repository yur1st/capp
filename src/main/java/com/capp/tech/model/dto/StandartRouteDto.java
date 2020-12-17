package com.capp.tech.model.dto;

import lombok.Data;

import java.util.LinkedList;
import java.util.List;

@Data
public class StandartRouteDto extends BaseDto {

    private String name;

    private List<StandartOperationDto> operations = new LinkedList<>();
}
