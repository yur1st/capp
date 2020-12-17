package com.capp.tech.model.dto;

import lombok.Data;

@Data
public abstract class BaseDto {

    protected Long id;
    protected boolean isActive;

}
