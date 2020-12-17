package com.capp.tech.model.dto;

import com.capp.tech.model.entity.AttributeLimitRange;
import com.capp.tech.model.entity.AttributeType;
import com.capp.tech.model.entity.Unit;
import lombok.Data;

@Data
public class AttributeDto extends BaseDto {

    private String name;

    private boolean isInfluenceCT;

    private AttributeLimitDto limitSet;

    private AttributeLimitRange limitRange;

    private AttributeType attributeType;

    private Unit unit;
}
