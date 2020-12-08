package com.capp.tech.model.dto;

import lombok.Data;

@Data
public class AttributeLimitRangeDto extends BaseDto {

    private double min;
    private double max;

}
