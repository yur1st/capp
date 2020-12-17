package com.capp.tech.model.dto;

import com.capp.tech.model.entity.OperationStatus;
import com.capp.tech.model.entity.StandartOperation;
import lombok.Data;

import java.util.Map;

@Data
public class OperationDto extends BaseDto {

    private Double cycleTime;

    private Map<String, String> attributeMap;

    private OperationStatus status;

    private StandartOperation standartOperation;
}
