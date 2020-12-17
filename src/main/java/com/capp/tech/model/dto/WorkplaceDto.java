package com.capp.tech.model.dto;

import com.capp.tech.model.entity.Line;
import com.capp.tech.model.entity.Operation;
import lombok.Data;

import java.util.List;

@Data
public class WorkplaceDto extends BaseDto {

    private String name;
    private Line line;
    private List<Operation> operations;
}
