package com.capp.tech.model.dto;

import com.capp.tech.model.entity.Device;
import com.capp.tech.model.entity.RouteStatus;
import com.capp.tech.model.entity.StandartRoute;
import lombok.Data;

import java.util.LinkedList;
import java.util.List;

@Data
public class RouteDto extends BaseDto {

    private String name;

    private List<OperationDto> operations = new LinkedList<>();

    private RouteStatus status;

    private StandartRoute standartRoute;

    private Device device;
}
