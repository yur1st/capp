package com.capp.tech.model.dto;

import com.capp.tech.model.entity.Route;
import lombok.Data;

@Data
public class DeviceDto extends BaseDto {

    private String name;
    private Route route;
}
